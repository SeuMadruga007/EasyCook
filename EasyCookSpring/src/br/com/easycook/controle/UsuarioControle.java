package br.com.easycook.controle;


import javax.servlet.http.HttpServletRequest;

import br.com.easycook.classesVO.UsuarioVO;
import br.com.easycook.service.UsuarioService;

public class UsuarioControle {
	UsuarioService usuario_Service = new UsuarioService();
	UsuarioService service = new UsuarioService();
	  
	
	public boolean cadastrarUsuario(UsuarioVO usuarioVO){
		try {
			return service.inserirUsuarioService(usuarioVO);
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean alterarUsuario(UsuarioVO usuarioVO){
		try {
			return  service.alterarUsuarioService(usuarioVO);
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public String pesquisarUsuario(String emailPesquisa){
		try {
			return  service.emailString(service.pesquisarUsuarioService(emailPesquisa));
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public String pesquisarUnicoUsuario(String emailPesquisa){
		try {
			return  service.stringUsuario(service.pesquisarEmailSelecionado(emailPesquisa));
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean excluirUsuario(String emailPesquisa){
		try {
			return  service.excluirUsuarioService(emailPesquisa);
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public UsuarioVO alimentarUsuarioVO(HttpServletRequest request){
		try {
			return service.alimentarUsuarioVO(request);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public String getEmail(HttpServletRequest request){
		return service.getEmail(request);
	}
	public String getUncioEmail(HttpServletRequest request){
		return service.getUnicoEmail(request);
	}
	
}
