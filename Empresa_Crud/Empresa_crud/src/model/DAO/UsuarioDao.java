package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.ConexaoBD;
import model.Usuario;

public class UsuarioDao {

	public boolean autenticar(Usuario usuario) {
		
		String sql = "SELECT * FROM usuario WHERE usuario=? AND senha=?";
		
		try (
				Connection conn = ConexaoBD.getConnection();
				
				PreparedStatement stmt = conn.prepareStatement(sql);
							
			) {
		       
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			
			ResultSet rs = stmt.executeQuery();
			
			return rs.next();
		
		} catch(Exception e) {
			System.out.println("Erro no login: " + e.getMessage());
			return false;
		}
		
	}
	
}