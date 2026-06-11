package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexaoBD {
	
	private static final String URL = "jdbc:mysql://localhost:3306/empresa";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	
	public static Connection getConnection() {
		
		try {
			
			return DriverManager.getConnection(URL, USER, PASSWORD);
		
		} catch (Exception e) {
			throw new RuntimeException("Erro na conexão!" + e.getMessage());
		}
		
	}
	
}