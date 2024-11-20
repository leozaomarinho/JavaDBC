package DB;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/nome_do_banco";
	private static final String USER = "usuario";
	private static final String PASSWORD = "senha";
	
	public static Connection getConnection() throws SQLEXception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(URL,USER,PASSWORD);
		} catch(ClassNotFoundException e) {
			throw new SqlException("Driver JBDC não encontrado.",e);
		}
	}
	
}
