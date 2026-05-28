package bo;

import dao.MovimentacaoDAO;
import dao.ProdutoDAO;
import java.util.ArrayList;
import model.Movimentacao;
import model.Produto;

public class MovimentacaoBO {

    private MovimentacaoDAO dao = new MovimentacaoDAO();
    private ProdutoDAO produtoDAO = new ProdutoDAO();
    private Produto produto = new Produto();

    private String ultimoAlertaEstoque = null;

    public boolean insertMovimentacao(String nomeProduto, String data, int qntdMovimentada, String tipoMovimentacao) {

        int idProduto = produtoDAO.procurarIdPorNome(nomeProduto);

        Movimentacao objeto = new Movimentacao(idProduto, data, qntdMovimentada, tipoMovimentacao);
        dao.insertMovimentacao(objeto);

        int estoqueAtual = produtoDAO.buscarQuantidadeEstoque(idProduto);
        int novoEstoque;

        if (tipoMovimentacao.equals("Entrada")) {
            novoEstoque = estoqueAtual + qntdMovimentada;
        } else {
            novoEstoque = estoqueAtual - qntdMovimentada;
        
        if (novoEstoque < 0) {
            this.ultimoAlertaEstoque = "ESTOQUE_NEGATIVO";
            return false;
        }
        }
        
        

        produtoDAO.atualizarQuantidadeEstoque(idProduto, novoEstoque);

        
        this.ultimoAlertaEstoque = verificarQntdMaxeMin(idProduto, novoEstoque);

        return true;
    }

    public boolean deleteMovimentacaoBO(int id) {
        dao.deleteMovimentacao(id);
        return true;
    }

    public ArrayList<Movimentacao> listarTodos() {
        return dao.listarTodos();
    }

    public boolean atualizarMovimentacao(int id, String nomeProduto, String data, int qntd, String tipoMovimentacao) {
        Movimentacao movimentacao = new Movimentacao(id, nomeProduto, data, qntd, tipoMovimentacao);
        dao.atualizarMovimentacao(movimentacao);
        return true;
    }

    public String verificarQntdMaxeMin(int idProduto, int novoEstoque) {
        Produto limites = produtoDAO.buscarLimitesPorId(idProduto);

        if (limites == null) {
            return null;
        }

        if (novoEstoque < limites.getQntdMin()) {
            return "ABAIXO_MINIMO";
        }

        if (novoEstoque > limites.getQntdMax()) {
            return "ACIMA_MAXIMO";
        }

        return null;
    }

    public String getUltimoAlertaEstoque() {
        return ultimoAlertaEstoque;
    }
}
