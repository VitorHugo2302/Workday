/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 * A classe BancoMysql é responsável por interagir com um banco de dados MySQL,
 * permitindo adicionar, editar e excluir registros.
 *
 * @version 1.0
 * @since 2023-06-13
 *
 * @see Banco.BancoMysql
 */
import java.sql.*;

public class BancoMysql {

    private static final String URL = "jdbc:mysql://localhost:3306/workday";
    private static final String USERNAME = "Workday";
    private static final String PASSWORD = "workday";
    private static Connection conn = null;
    private static Statement statement;

    /**
     * Obtém uma conexão com o banco de dados.
     *
     * @return A conexão estabelecida.
     * @throws SQLException Se ocorrer um erro ao tentar obter a conexão.
     */
    public static Connection getConnection() throws SQLException {
        statement = conn.createStatement();
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    /**
     * Executa uma consulta SQL no banco de dados.
     *
     * @param sql A consulta SQL a ser executada.
     * @return O resultado da consulta.
     * @throws SQLException Se ocorrer um erro ao tentar executar a consulta.
     */
    public static ResultSet ExecutarConsulta(String sql) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (conn == null || statement.isClosed()) {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                statement = conn.createStatement();
            }
            return statement.executeQuery(sql);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao tentar acessar o banco!");
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

     /**
     * Deleta um registro do banco de dados.
     *
     * @param sql O comando SQL para deletar o registro.
     * @return true se o registro foi deletado com sucesso, false caso contrário.
     * @throws SQLException Se ocorrer um erro ao tentar deletar o registro.
     */
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

    /**
     * Atualiza um registro no banco de dados.
     *
     * @param sql O comando SQL para atualizar o registro.
     * @return true se o registro foi atualizado com sucesso, false caso contrário.
     * @throws SQLException Se ocorrer um erro ao tentar atualizar o registro.
     */
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

     /**
     * Insere um novo registro no banco de dados.
     *
     * @param sql O comando SQL para inserir o novo registro.
     * @return true se o registro foi inserido com sucesso, false caso contrário.
     * @throws SQLException Se ocorrer um erro ao tentar inserir o registro.
     */
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

    /**
     * Fecha a conexão com o banco de dados.
     *
     * @throws SQLException Se ocorrer um erro ao tentar fechar a conexão.
     */
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
