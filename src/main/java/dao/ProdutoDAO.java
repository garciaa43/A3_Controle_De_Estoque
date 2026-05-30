package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private final String URL
            = "jdbc:mysql://localhost:3306/a3_controle_de_estoque";

    private final String USER = "root";

    private final String PASSWORD = "1234";

    // MÉTODO DE CONEXÃO
    public Connection conectar() throws SQLException {

        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }

    // CADASTRAR
   public void cadastrar(Produto produto) {
    String sql = "INSERT INTO Produto(nome, id_categoria, preco_unitario, qntd_estoque, qntd_min_estoque, qntd_max_estoque, unidade) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, produto.getNome());
        stmt.setInt(2, produto.getId_categoria());
        stmt.setDouble(3, produto.getPreco());
        stmt.setInt(4, produto.getQuantidade());
        stmt.setInt(5, produto.getQntdMin());
        stmt.setInt(6, produto.getQntdMax());
        stmt.setString(7, produto.getUnidade());

        stmt.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

   public boolean existePorNome(String nome) {
    String sql = "SELECT COUNT(*) FROM Produto WHERE nome = ?";

    try (Connection conn = conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return rs.getInt(1) > 0;
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return false;
}
   
   
    // LISTAR
    public List<Produto> listar() {

        List<Produto> lista = new ArrayList<>();

        String sql = "SELECT p.id_produto, p.nome, p.preco_unitario, p.unidade, p.qntd_estoque, p.qntd_min_estoque, p.qntd_max_estoque, c.nome "
                    + "FROM Produto p "
                    + "INNER JOIN Categoria c "
                    + "ON p.id_produto = p.id_produto";

        try (
                Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id_produto"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco_unitario"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setQuantidade(rs.getInt("qntd_estoque"));
                produto.setQntdMin(rs.getInt("qntd_min_estoque"));
                produto.setQntdMax(rs.getInt("qntd_max_estoque"));
                produto.setNome_categoria(rs.getString("nome"));
                

                lista.add(produto);
            }

        } catch (SQLException e) {

            System.out.println("Erro ao listar produtos");
            e.printStackTrace();
        }

        return lista;
    }

    // EDITAR
    public void atualizar(Produto produto) {

        String sql
                = "UPDATE produto SET nome=?, quantidade=?, preco=? WHERE id=?";

        try (
                Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setInt(4, produto.getId());

            stmt.executeUpdate();

            System.out.println("Produto atualizado!");

        } catch (SQLException e) {

            System.out.println("Erro ao atualizar produto");
            e.printStackTrace();
        }
    }

    // EXCLUIR
    public void excluir(int id) {

        String sql
                = "DELETE FROM produto WHERE id=?";

        try (
                Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();

            System.out.println("Produto excluído!");

        } catch (SQLException e) {

            System.out.println("Erro ao excluir produto");
            e.printStackTrace();
        }
    }

    public int procurarIdPorNome(String nomeProduto) {
        String sql = "SELECT id_produto FROM Produto WHERE nome = ?";

        try {

            Connection conn = conectar();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, nomeProduto);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_produto");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }

    public ArrayList<Produto> listarPrecosPorProdutos() {
        ArrayList<Produto> lista = new ArrayList<>();

        String sql = "SELECT "
                + "p.nome, "
                + "p.preco_unitario, "
                + "p.unidade, "
                + "c.nome AS categoria "
                + "FROM Produto p "
                + "INNER JOIN Categoria c "
                + "ON p.id_categoria = c.id_categoria "
                + "ORDER BY p.nome";

        try (
                Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco_unitario"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setNome_categoria(rs.getString("categoria"));

                lista.add(produto);
            }

        } catch (SQLException e) {

            System.out.println("Erro ao listar produtos");
            e.printStackTrace();
        }

        return lista;
    }

    public ArrayList<Produto> listarProdutosAbaixoMinimo() {

        ArrayList<Produto> lista = new ArrayList<>();

        String sql = "SELECT "
                + "nome, "
                + "qntd_min_estoque, "
                + "qntd_estoque "
                + "FROM Produto "
                + "WHERE qntd_estoque < qntd_min_estoque "
                + "ORDER BY nome";

        try (
                Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setNome(rs.getString("nome"));
                produto.setQntdMin(rs.getInt("qntd_min_estoque"));

                produto.setQuantidade(rs.getInt("qntd_estoque"));

                lista.add(produto);
            }

        } catch (SQLException e) {

            System.out.println(
                    "Erro ao listar produtos abaixo do mínimo"
            );

            e.printStackTrace();
        }

        return lista;
    }

    public boolean atualizarQuantidadeEstoque(
            int idProduto,
            int novaQuantidade
    ) {

        String sql
                = "UPDATE Produto SET qntd_estoque = ? "
                + "WHERE id_produto = ?";

        try {

            Connection conn = conectar();

            PreparedStatement stmt
                    = conn.prepareStatement(sql);

            stmt.setInt(1, novaQuantidade);
            stmt.setInt(2, idProduto);

            stmt.executeUpdate();

            stmt.close();
            conn.close();

            return true;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }

    public int buscarQuantidadeEstoque(int idProduto) {
        String sql
                = "SELECT qntd_estoque FROM Produto WHERE id_produto = ?";

        try {

            Connection conn = conectar();

            PreparedStatement stmt
                    = conn.prepareStatement(sql);

            stmt.setInt(1, idProduto);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                return rs.getInt("qntd_estoque");
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return 0;
    }

    public ArrayList<String> listarNomesProdutos() {
        ArrayList<String> lista = new ArrayList<>();

        String sql = "SELECT nome FROM produto ORDER BY nome";

        try {

            Connection conn = conectar();

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                lista.add(rs.getString("nome"));

            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return lista;

    }

    public Produto buscarLimitesPorId(int idProduto) {
        String sql = "SELECT qntd_min_estoque, qntd_max_estoque FROM Produto WHERE id_produto = ?";

        try {
            Connection conn = conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idProduto);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Produto produto = new Produto();
                produto.setQntdMin(rs.getInt("qntd_min_estoque"));
                produto.setQntdMax(rs.getInt("qntd_max_estoque"));
                return produto;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean reajustarPrecoTodos(double porcentagem) {
        String sql = "UPDATE Produto SET preco_unitario = preco_unitario * (1 + ? / 100)";

        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, porcentagem);
            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean reajustarPrecoPorId(int idProduto, double porcentagem) {
        String sql = "UPDATE Produto SET preco_unitario = preco_unitario * (1 + ? / 100) WHERE id_produto = ?";

        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, porcentagem);
            stmt.setInt(2, idProduto);
            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
