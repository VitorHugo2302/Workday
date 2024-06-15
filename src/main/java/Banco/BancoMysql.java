/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Vitor Hugo
 */
import java.sql.*;

public class BancoMysql {

    private static final String URL = "jdbc:mysql://localhost:3306/workday";
    private static final String USERNAME = "Workday";
    private static final String PASSWORD = "workday";
    private static Connection conn = null;
    private static Statement statement;
    private static ResultSet resultSet;

    public static Connection getConnection() throws SQLException {
        statement = conn.createStatement();
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static ResultSet ExecutarConsulta(String sql) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (conn == null || statement.isClosed()) {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                statement = conn.createStatement();
            }
            return resultSet = statement.executeQuery(sql);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao tentar acessar o banco!");
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    public static boolean Deletar(String sql) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (conn == null || statement.isClosed()) {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                statement = conn.createStatement();
            }
            PreparedStatement statement = conn.prepareStatement(sql);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao tentar deletar registro do banco!");
            System.out.println("Erro: " + e.getMessage());
        }
        return false;
    }

    public static boolean Atualizar(String sql) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (conn == null || statement.isClosed()) {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                statement = conn.createStatement();
            }
            PreparedStatement statement = conn.prepareStatement(sql);

            int rows = statement.executeUpdate();
            if (rows > 0) {
                FecharConexao();
                return true;
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao tentar atualizar registro do banco!");
            System.out.println("Erro: " + e.getMessage());
        }
        return false;
    }

    public static boolean Inserir(String sql) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (conn == null || statement.isClosed()) {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                statement = conn.createStatement();
            }
            PreparedStatement statement = conn.prepareStatement(sql);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                FecharConexao();
                return true;
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao tentar inserir o registro no banco!");
            System.out.println("Erro: " + e.getMessage());
        }
        return false;
    }

    public static void FecharConexao() throws SQLException {

        try {
            //resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.out.println("Erro ao tentar fechar a conexão com o banco!");
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
