package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Movimentacao;

public class MovimentacaoDAO {

    private ArrayList<Movimentacao> minhaLista = new ArrayList<>();

    public Connection getConexao() {
        Connection connection = null; //instância da conexão
        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "a3_controle_de_estoque";
            String url = "jdbc:mysql://" + server + ":3306/"
                    + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "1234";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return connection;
        } catch (ClassNotFoundException e) { //Driver não encontrado
            System.out.println("O driver nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    public boolean insertMovimentacao(Movimentacao objeto) {

        String sql = "INSERT INTO Movimentacao(id_produto, data, quantidade, tipo) VALUES(?,?,?,?)";
        try {
            Connection conn = getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, objeto.getId_produto());
            stmt.setString(2, objeto.getDataMovimentacao());
            stmt.setInt(3, objeto.getQntdMovimentada());
            stmt.setString(4, objeto.getTipoMovimentacao());

            stmt.execute();
            stmt.close();

            return true;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }

    }

    public boolean deleteMovimentacao(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM Movimentacao WHERE id_movimentacao = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;

    }

    public ArrayList<Movimentacao> listarTodos() {

        minhaLista.clear();

        try {

            Statement stmt = this.getConexao().createStatement();

            ResultSet res = stmt.executeQuery(
                    "SELECT m.data, m.quantidade, m.tipo, p.nome, m.id_movimentacao "
                    + "FROM Movimentacao m "
                    + "INNER JOIN Produto p "
                    + "ON m.id_produto = p.id_produto"
            );

            while (res.next()) {
                int id = res.getInt("id_movimentacao");
                String nomeProduto = res.getString("nome");

                String data = res.getString("data");

                int quantidade = res.getInt("quantidade");

                String tipo = res.getString("tipo");

                Movimentacao objeto = new Movimentacao(
                        id,
                        nomeProduto,
                        data,
                        quantidade,
                        tipo
                );

                minhaLista.add(objeto);
            }

            res.close();
            stmt.close();

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

        return minhaLista;
    }

    public boolean atualizarMovimentacao(Movimentacao movimentacao) {
        String sql = "UPDATE Movimentacao set data = ? ,quantidade = ? ,tipo = ? WHERE id_movimentacao = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setString(1, movimentacao.getDataMovimentacao());
            stmt.setInt(2, movimentacao.getQntdMovimentada());
            stmt.setString(3, movimentacao.getTipoMovimentacao());
            stmt.setInt(4, movimentacao.getId());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }

    }

    public Movimentacao produtoMaisEntrada() {
        String sql = "SELECT p.nome, SUM(m.quantidade) AS total "
                + "FROM Movimentacao m "
                + "INNER JOIN Produto p ON m.id_produto = p.id_produto "
                + "WHERE m.tipo = 'ENTRADA' "
                + "GROUP BY p.id_produto, p.nome "
                + "ORDER BY total DESC "
                + "LIMIT 1";

        try (Connection conn = getConexao(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                Movimentacao obj = new Movimentacao();
                obj.setNomeProduto(rs.getString("nome"));
                obj.setQntdMovimentada(rs.getInt("total"));
                return obj;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Movimentacao produtoMaisSaida() {
        String sql = "SELECT p.nome, SUM(m.quantidade) AS total "
                + "FROM Movimentacao m "
                + "INNER JOIN Produto p ON m.id_produto = p.id_produto "
                + "WHERE m.tipo = 'SAIDA' "
                + "GROUP BY p.id_produto, p.nome "
                + "ORDER BY total DESC "
                + "LIMIT 1";

        try (Connection conn = getConexao(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                Movimentacao obj = new Movimentacao();
                obj.setNomeProduto(rs.getString("nome"));
                obj.setQntdMovimentada(rs.getInt("total"));
                return obj;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
