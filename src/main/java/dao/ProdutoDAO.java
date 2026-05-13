/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Weslen
 */
public class ProdutoDAO {

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

    public int procurarIdPorNome(String nomeProduto) {

        String sql = "SELECT id_produto FROM Produto WHERE nome = ?";

        try {
            Connection conn = getConexao();
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

}
