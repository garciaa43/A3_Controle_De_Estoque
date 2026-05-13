package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Movimentacao;

public class MovimentacaoDAO {

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

            stmt.setInt(1, objeto.getId_Produto());
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

}
