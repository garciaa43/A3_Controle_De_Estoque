package dao;

import model.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private final String URL
            = "jdbc:mysql://localhost:3306/estoque";

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

        String sql
                = "INSERT INTO produto(nome, quantidade, preco) VALUES (?, ?, ?)";

        try (
                Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());

            stmt.executeUpdate();

            System.out.println("Produto cadastrado!");

        } catch (SQLException e) {

            System.out.println("Erro ao cadastrar produto");
            e.printStackTrace();
        }
    }

    // LISTAR
    public List<Produto> listar() {

        List<Produto> lista = new ArrayList<>();

        String sql = "SELECT * FROM produto";

        try (
                Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getDouble("preco"));

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
                + "    p.nome,"
                + "    p.preco_unitario,"
                + "    p.unidade,"
                + "    c.nome AS categoria"
                + "FROM produto p"
                + "INNER JOIN categoria c "
                + "ON p.id_categoria = c.id_categoria"
                + "ORDER BY p.nome;";

        try (
                Connection conn = conectar();
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getDouble("preco"));

                lista.add(produto);
            }

        } catch (SQLException e) {

            System.out.println("Erro ao listar produtos");
            e.printStackTrace();
        }

        return lista;
    }
}
