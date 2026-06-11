package controller;

import model.Usuario;
import model.DAO.UsuarioDao;

public class LoginController {

	private UsuarioDao dao;
	
	public LoginController() {
		dao = new UsuarioDao();
	}
	
	public boolean autenticarLogin(String usuario, String senha) {
		
		Usuario u = new Usuario(usuario, senha);
		return dao.autenticar(u);
		
	}
}