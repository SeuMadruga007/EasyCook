package br.com.easycook.controle;

import javax.servlet.http.HttpServletRequest;

import br.com.easycook.classesVO.UsuarioVO;
import br.com.easycook.service.LoginService;

public class LoginControle {
	
LoginService lService = new LoginService();
UsuarioVO usuarioVo;
	public UsuarioVO efetuarLogin(HttpServletRequest request){
		try {
			usuarioVo = new UsuarioVO();
			usuarioVo = lService.logar(alimentarUsuarioVO(request, usuarioVo));
			/*
			if(usuarioVo!=null){
				return usuarioVo;
			}else
				return null;*/
			return usuarioVo; 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public UsuarioVO alimentarUsuarioVO(HttpServletRequest request, UsuarioVO usuarioVo){
		try {
			String email = request.getParameter("txtEmail");
			String senha = request.getParameter("txtSenha");
			usuarioVo.setEmail(email);
			usuarioVo.setSenha(senha);
			return usuarioVo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean deslogar(HttpServletRequest request) {
		try {
			request.getSession().removeAttribute("usuarioLogado");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	

}
