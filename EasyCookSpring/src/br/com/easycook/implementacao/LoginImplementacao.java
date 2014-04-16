package br.com.easycook.implementacao;

import java.sql.ResultSet;

import br.com.easycook.Interface.LoginInterface;
import br.com.easycook.classesVO.UsuarioVO;
import br.com.easycook.util.Conexao;

public class LoginImplementacao implements LoginInterface{

	Conexao objConexao;
	@Override
	public UsuarioVO logar(UsuarioVO usuarioVo) {
		try {
			objConexao = new Conexao();
			
			StringBuilder sql = new StringBuilder();
			
			sql.append("select * ")
			.append("from usuario ")
			.append("where email='"+usuarioVo.getEmail()+"' ")
			.append("and ")
			.append("senha ='"+usuarioVo.getSenha()+"'");
			
			ResultSet rs = objConexao.executarConsulta(sql.toString());
			
			if(rs.next()){
					usuarioVo.setIdUsuario(rs.getInt(1));
					usuarioVo.setTipoUsuario(rs.getInt(2));
					usuarioVo.setNome(rs.getString(3));
					usuarioVo.setTelefone(rs.getString(4));
					usuarioVo.setEmail(rs.getString(5));
					usuarioVo.setSenha(rs.getString(6));
					
				return usuarioVo;
			}else{
				return null;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			objConexao.fecharConexao();
		}
	}

}
