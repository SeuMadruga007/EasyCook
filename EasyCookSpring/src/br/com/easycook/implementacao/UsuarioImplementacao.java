package br.com.easycook.implementacao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.easycook.Interface.UsuarioInterface;
import br.com.easycook.classesVO.UsuarioVO;
import br.com.easycook.util.Conexao;

public class UsuarioImplementacao implements UsuarioInterface{
	
	Conexao objConexao = new Conexao();
	ResultSet rs;
	UsuarioVO usuVo;
	ArrayList<UsuarioVO> usuarios;
	
	
	@Override
	public boolean inserirUsuario(UsuarioVO UsuarioVo) {
		try {
			StringBuffer sql = new StringBuffer();
			
			sql.append(" insert into usuario values( ")
			   .append( UsuarioVo.getTipoUsuario() +", ")
			   .append(" '"+UsuarioVo.getNome().trim()+"' ,")
			   .append(" '"+UsuarioVo.getTelefone().trim()+"' ,")
			   .append(" '"+UsuarioVo.getEmail().trim()+"' ,")
			  // .append(" '"+UsuarioVo.getLogin().trim()+"' ,")
			   .append(" '"+UsuarioVo.getSenha().trim()+"' )");
			
			int retorno = objConexao.executarComando(sql.toString());
			
			if(retorno==1){
				return true;
			}else 
				return false;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			objConexao.fecharConexao();
		}
	}

	@Override
	public boolean alterarUsuario(UsuarioVO UsuarioVo) {
		try {
			StringBuffer sql = new StringBuffer();
			
			sql.append("update usuario set  ")
			   .append("idTipo_Usuario = "+ UsuarioVo.getTipoUsuario() +" , ")
			   .append("nome= '"+UsuarioVo.getNome().trim()+"',")
			   .append("telefone= '"+UsuarioVo.getTelefone().trim()+"' ,")
			   .append("email= '"+UsuarioVo.getEmail().trim()+"' ,")
			   //.append("login= '"+UsuarioVo.getLogin().trim()+"' ,")
			   .append("senha= '"+UsuarioVo.getSenha().trim()+"' ")
			   .append("where idUsuario = "+UsuarioVo.getIdUsuario());
			
			int i = objConexao.executarComando(sql.toString());
			if(i==1){
				return true;
			}else
				return false;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			objConexao.fecharConexao();
		}
		
	}

	@Override
	public boolean excluirUsuario(String email) {
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("delete from usuario where email = '"+email+"'");
			
			int i =objConexao.executarComando(sql.toString());
			if(i==1){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			objConexao.fecharConexao();
		}
	}

	/*@Override
	public UsuarioVO pesquisar_Usuario(UsuarioVO UsuarioVo) {
		try {
			rs = objConexao.executarConsulta("select nome,email,login,senha,telefone from usuario where email = '"+UsuarioVo.getEmail()+"'");
			while(rs.next()){
				UsuarioVo.setNome(rs.getString(1));
				UsuarioVo.setEmail(rs.getString(2));
				UsuarioVo.setLogin(rs.getString(3));
				UsuarioVo.setSenha(rs.getString(4));
				UsuarioVo.setTelefone(rs.getString(5));
			}
			
			return UsuarioVo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}*/
	
	@Override
	public ArrayList<UsuarioVO> pesquisarUsuario(String emailPesquisa) throws SQLException{
		try {
			usuarios = new ArrayList<UsuarioVO>();
			rs = objConexao.executarConsulta("select email from usuario where email like '%"+emailPesquisa+"%'");
			
			while(rs.next()){
				usuVo = new UsuarioVO();
				usuVo.setEmail(rs.getString(1));
				
				usuarios.add(usuVo);
			}
			
			return usuarios;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			objConexao.fecharConexao();
		}
		
	}

	@Override
	public ArrayList<UsuarioVO> pesquisarEmailSelecionado(String email) {
		try {
			usuarios = new ArrayList<UsuarioVO>();
			rs = objConexao.executarConsulta("select idUsuario,nome,email,senha,telefone,idTipo_Usuario from usuario where email like '%"+email+"%'");				
			
			while(rs.next()){
				usuVo = new UsuarioVO();
				usuVo.setIdUsuario(Integer.parseInt(rs.getString(1)));
				usuVo.setNome(rs.getString(2));
				usuVo.setEmail(rs.getString(3));
				//usuVo.setLogin(rs.getString(4));
				usuVo.setSenha(rs.getString(4));
				usuVo.setTelefone(rs.getString(5));
				usuVo.setTipoUsuario(Integer.parseInt(rs.getString(6)));
				
				usuarios.add(usuVo);
			}
			
			
			System.out.println(">>>>>> FOR DEPOIS DO SELECT <<<<<<<<<<<<<");
			for (int i = 0; i < usuarios.size(); i++) {
				
				
				usuarios.get(i).getEmail();
				usuarios.get(i).getNome();
				usuarios.get(i).getSenha();
				usuarios.get(i).getTelefone();
				usuarios.get(i).getTipoUsuario();
			}
			return usuarios; 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
