package br.com.easycook.Interface;


import java.sql.SQLException;
import java.util.ArrayList;

import br.com.easycook.classesVO.UsuarioVO;

public interface UsuarioInterface {
	
	public boolean inserirUsuario(UsuarioVO UsuarioVo)throws SQLException;
	public boolean alterarUsuario(UsuarioVO UsuarioVo)throws SQLException;
	public boolean excluirUsuario(String email)throws SQLException;
	public ArrayList<UsuarioVO> pesquisarUsuario(String emailPesquisa)throws SQLException;
	public ArrayList<UsuarioVO> pesquisarEmailSelecionado(String email)throws SQLException;
	

}
