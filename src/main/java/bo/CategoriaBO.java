package bo;

import dao.CategoriaDAO;
import java.util.ArrayList;
import model.Categoria;

public class CategoriaBO {

    private CategoriaDAO dao = new CategoriaDAO();

    public boolean insertCategoria(String nomeCategoria, String embalagem, String tamanho) {
        Categoria objeto = new Categoria(nomeCategoria, tamanho, embalagem);

        dao.insertCategoriaDAO(objeto);
        return true;

    }

    public ArrayList<Categoria> listarTodos() {
        return dao.listarTodos();
    }

    public boolean atualizarCategoria(int id, String nomeCategoria, String embalagem, String tamanho) {
        Categoria categoria = new Categoria(id, nomeCategoria, embalagem, tamanho);
        dao.atualizarCategoria(categoria);
        return true;
    }

    public boolean deleteCategoria(int id) {

        dao.deleteCategoriaDAO(id);
        return true;
    }

    public ArrayList<String> listarNomesCategorias() {

        return dao.listarNomesCategorias();
    }

    public ArrayList<String[]> quantidadeProdutosPorCategoria() {
        return dao.quantidadeProdutosPorCategoria();
    }

    public int buscarIdPorNome(String categoria) {
        return dao.buscarIdPorNome(categoria);

    }

}
