package bo;

import dao.CategoriaDAO;
import java.util.ArrayList;
import model.Categoria;

public class CategoriaBO {

    private CategoriaDAO dao = new CategoriaDAO();

    public boolean insertCategoria(String nomeCategoria, String embalagem, String tamanho) {
        Categoria objeto = new Categoria(nomeCategoria, embalagem, tamanho);
        
        dao.insertCategoriaDAO(objeto);
        return true;

    }
 public ArrayList<Categoria> listarTodos() {
        return dao.listarTodos();
    }

}
