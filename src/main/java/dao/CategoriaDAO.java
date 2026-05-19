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
import java.sql.Statement;
import java.util.ArrayList;
import model.Categoria;


/**
 *
 * @author Marquinhos
 */
public class CategoriaDAO {

        private ArrayList<Categoria> minhaLista = new ArrayList<>();

 

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
            String password = "@Kamura1207";

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

    
   public boolean insertCategoriaDAO(Categoria objeto) {

        String sql = "INSERT INTO Categoria(id_categoria, nome, tamanho, embalagem) VALUES(?,?,?,?)";
        try {
            Connection conn = getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, objeto.getId_categoria());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTamanho());
            stmt.setString(4, objeto.getEmbalegem());

            stmt.execute();
            stmt.close();

            return true;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }

    }

    public ArrayList<Categoria> listarTodos() {

        minhaLista.clear();

        try {

            Statement stmt = this.getConexao().createStatement();

            ResultSet res = stmt.executeQuery(
                    "SELECT * FROM Categoria;"
            );

            while (res.next()) {
                int id = res.getInt("id_categoria");
                String nomeCategoria = res.getString("nome");

                String tamanho = res.getString("tamanho");

                String embalagem = res.getString("embalagem");


                Categoria objeto = new Categoria(
                        id,
                        nomeCategoria,
                        tamanho,
                        embalagem
                       
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
    
}
