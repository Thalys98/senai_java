package controller;
import model.Cliente;
import model.DAO.ClienteDao;

public class ClienteController {
	
	private ClienteDao dao;
	
	
	public ClienteController() {
		dao = new ClienteDao();
	}

	public void inserirCliente(String nome, String email) {
		Cliente cliente = new Cliente(0,nome,email);
		dao.inserir(cliente);
		
	}
	
	public void listarClientes() {
		dao.listar();
	}
	
	public void atualizarCliente(int id, String nome, String email) {
		
		Cliente cliente = new Cliente(id, nome, email);
		dao.atualizar(cliente);
		
	}

	public void excluirCliente(int id) {
		dao.excluir(id);
	}
}





