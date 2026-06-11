package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.ConexaoBD;
import model.Cliente;

public class ClienteDao {
	
	//CREATE
	public void inserir(Cliente cliente) {
		
		String sql = "INSERT INTO cliente(nome, email) VALUES (?,?)";
	
		try (
				Connection conn = ConexaoBD.getConnection();
				
				PreparedStatement stmt = conn.prepareStatement(sql);
						
		){
				stmt.setString(1, cliente.getNome());
				stmt.setString(2, cliente.getEmail());
				
				stmt.execute();
				
				System.out.println("Cliente inserido com sucesso!");
				System.out.println();
		 
		} catch(Exception e){
			System.out.println("Erro!" + e.getMessage());
		}
		
	}
	
	//READ
	public void listar() {
		
		String sql = "SELECT * FROM cliente";
		
		try (
				Connection conn = ConexaoBD.getConnection();
				
				PreparedStatement stmt = conn.prepareStatement(sql);
				
				ResultSet rs = stmt.executeQuery();			
				
			) {
			
				while(rs.next()) {
					
					int id = rs.getInt("id");
					String nome = rs.getString("nome");
					String email = rs.getString("email");
					
					System.out.println("ID: " + id +
										" | Nome: " + nome +
										" | E-mail: " + email
									   );
				}
			
		} catch(Exception e) {
			System.out.println("Erro ao listas clientes: " + e.getMessage());
		}
		
		
	}
	
	//UPDATE
	public void atualizar(Cliente cliente) {
		
		String sql = "UPDATE cliente SET nome=?, email=? WHERE id=?";
		
		try(
				
				Connection conn = ConexaoBD.getConnection();
				
				PreparedStatement stmt = conn.prepareStatement(sql);
		 ){
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setInt(3, cliente.getId());
			
			int linhas = stmt.executeUpdate();
			
			if(linhas > 0) {
				System.out.println("Cliente atualizado com sucesso!");
				System.out.println();
			}else {
				System.out.println("ID não encontrado!");
			}
			
		  }catch(Exception e) {
			  System.out.println("Erro ao atualizar: " + e.getMessage());
		  }
		
	}
	
	//DELETE
	public void excluir(int id) {
	
		String sql = "DELETE FROM cliente WHERE id=?";
		
		try(
			
				Connection conn = ConexaoBD.getConnection();
				
				PreparedStatement stmt = conn.prepareStatement(sql);	
			){	
				stmt.setInt(1, id);
				
				int linhas = stmt.executeUpdate();
				
				if(linhas > 0) {
					System.out.println("Cliente excluído com sucesso!");
					System.out.println();
					
				}else {
					System.out.println("Cliente não encontrado!");
				}
				
			} catch(Exception e) {
				System.out.println("Erro ao excluir: " + e.getMessage());
			}
		
	}
}
















