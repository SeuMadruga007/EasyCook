package br.com.easycook.Interface;

import br.com.easycook.classesVO.TipoUsuarioVO;

public interface TipoUsuarioInterface {

	public boolean inserirTipoUsuario(TipoUsuarioVO Tipo_UsuarioVo);
	public boolean alterarTipoUsuario(TipoUsuarioVO Tipo_UsuarioVo);
	public boolean excluirTipoUsuario(TipoUsuarioVO Tipo_UsuarioVo);
	public boolean pesquisarTipoUsuario(TipoUsuarioVO Tipo_UsuarioVo);
	
}
