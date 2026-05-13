
package bo;

import dao.MovimentacaoDAO;
import dao.ProdutoDAO;
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
}
