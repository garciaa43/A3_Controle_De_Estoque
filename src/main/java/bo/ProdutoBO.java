package bo;

import dao.ProdutoDAO;
import java.util.ArrayList;
import model.Produto;

import java.util.List;

public class ProdutoBO {

    ProdutoDAO dao = new ProdutoDAO();

    // CADASTRAR
    public void cadastrar(Produto produto) {

        if (produto.getNome().isEmpty()) {

            System.out.println("Nome obrigatório!");
            return;
        }

        if (produto.getPreco() <= 0) {

            System.out.println("Preço inválido!");
            return;
        }

        dao.cadastrar(produto);
    }

    // LISTAR
    public List<Produto> listar() {

        return dao.listar();
    }

    // ATUALIZAR
    public void atualizar(Produto produto) {

        dao.atualizar(produto);
    }

    // EXCLUIR
    public void excluir(int id) {

        dao.excluir(id);
    }

    public ArrayList<Produto> listarPrecosPorProdutos() {

        return dao.listarPrecosPorProdutos();
    }

    public ArrayList<Produto> listarProdutosAbaixoMinimo() {

        return dao.listarProdutosAbaixoMinimo();
    }

    public ArrayList<String> listarNomesProdutos() {
        return dao.listarNomesProdutos();
    }

    public int buscarIdPorNome(String nome) {
        return dao.procurarIdPorNome(nome);
    }

    public boolean reajustarPrecoTodos(double porcentagem) {
        return dao.reajustarPrecoTodos(porcentagem);
    }

    public boolean reajustarPrecoPorId(int idProduto, double porcentagem) {
        return dao.reajustarPrecoPorId(idProduto, porcentagem);
    }
}
