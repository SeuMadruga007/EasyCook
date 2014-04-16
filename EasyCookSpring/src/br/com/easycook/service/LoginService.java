package br.com.easycook.service;

import br.com.easycook.classesVO.UsuarioVO;
import br.com.easycook.implementacao.LoginImplementacao;

public class LoginService extends LoginImplementacao {
	
	public UsuarioVO logar(UsuarioVO  usuarioVo){
		return super.logar(usuarioVo); 
	}
	
}
