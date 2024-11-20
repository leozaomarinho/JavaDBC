import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import DB.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            System.out.println("Conexão bem-sucedida!");

            // Exemplo de consulta SQL para listar nomes de clientes
            String sql = "SELECT nome FROM clientes";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println("Cliente: " + resultSet.getString("nome"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
