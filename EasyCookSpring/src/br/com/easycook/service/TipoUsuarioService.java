package br.com.easycook.service;

import br.com.easycook.classesVO.TipoUsuarioVO;
import br.com.easycook.implementacao.TipoUsuarioImplementacao;

public class TipoUsuarioService extends TipoUsuarioImplementacao{

	public void inserir_Tipo_Usuario_Service(TipoUsuarioVO Tipo_UsuarioVo){
		super.inserirTipoUsuario(Tipo_UsuarioVo);
	}
	
	public void alterar_Tipo_Usuario_Service(TipoUsuarioVO Tipo_UsuarioVo){
		super.alterarTipoUsuario(Tipo_UsuarioVo);
	}
	
	public void excluir_Tipo_Usuario_Service(TipoUsuarioVO Tipo_UsuarioVo){
		super.excluirTipoUsuario(Tipo_UsuarioVo);
	}
	
	public void pesquisar_Tipo_Usuario_Service(TipoUsuarioVO Tipo_UsuarioVo){
		super.pesquisarTipoUsuario(Tipo_UsuarioVo);
	}
	
}
