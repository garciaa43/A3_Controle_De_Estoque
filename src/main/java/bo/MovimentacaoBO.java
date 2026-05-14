
package bo;

import dao.MovimentacaoDAO;
import dao.ProdutoDAO;
import java.util.ArrayList;
import model.Movimentacao;


public class MovimentacaoBO {
    
    private MovimentacaoDAO dao = new MovimentacaoDAO();
    private ProdutoDAO produtoDAO = new ProdutoDAO();
   
    
    
    
    public boolean insertMovimentacao(String nomeProduto, String data, int qntdMovimentada, String tipoMovimentacao) {
        
         int produto = produtoDAO.procurarIdPorNome(nomeProduto);
         
         
        Movimentacao objeto = new Movimentacao(produto, data, qntdMovimentada, tipoMovimentacao);
        dao.insertMovimentacao(objeto);
        
        return true;
    }

    public boolean deleteMovimentacaoBO(int id) {
        dao.deleteMovimentacao(id);
        return true;
    }

    public ArrayList<Movimentacao> listarTodos() {
        return dao.listarTodos();
    }

    public boolean atualizarMovimentacao(int id,String nomeProduto, String data, int qntd, String tipoMovimentacao) {
        Movimentacao movimentacao = new Movimentacao(id, nomeProduto, data, qntd, tipoMovimentacao);
        dao.atualizarMovimentacao(movimentacao);
        return true;
    }
}
