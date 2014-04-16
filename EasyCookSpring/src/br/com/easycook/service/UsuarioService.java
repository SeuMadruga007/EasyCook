package br.com.easycook.service;


import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.api.addressing.AddressingVersion.EPR;

import br.com.easycook.classesVO.UsuarioVO;
import br.com.easycook.implementacao.UsuarioImplementacao;

public class UsuarioService extends UsuarioImplementacao{
	
	public boolean  inserirUsuarioService(UsuarioVO UsuarioVo){
		return super.inserirUsuario(UsuarioVo);
	}
	
	public boolean  alterarUsuarioService(UsuarioVO UsuarioVo){
		return super.alterarUsuario(UsuarioVo);
	}
	
	public boolean excluirUsuarioService(String email)throws SQLException{
		try {
			return super.excluirUsuario(email);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<UsuarioVO> pesquisarUsuarioService(String emailPesquisa) throws SQLException{
		return super.pesquisarUsuario(emailPesquisa);
	}
	
	public ArrayList<UsuarioVO> pesquisarEmailSelecionado(String email){
		return super.pesquisarEmailSelecionado(email);
	}
	
	public String emailString(ArrayList<UsuarioVO> arrayList){
		try {
			StringBuilder retorno = new StringBuilder();
			if(arrayList.size()==0){
				return null;
			}else{
			for (int i = 0; i < arrayList.size(); i++) {
				if((i+1)==arrayList.size()){
					retorno.append(arrayList.get(i).getEmail());
				}else
					retorno.append(arrayList.get(i).getEmail()+";");
			}
			return retorno.toString();
		}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public String stringUsuario(ArrayList<UsuarioVO> listaUsuario){
		try {
			StringBuilder retorno = new StringBuilder();
			
			for (int i = 0; i < listaUsuario.size(); i++) {
				retorno.append(listaUsuario.get(i).getIdUsuario()+";")
				.append(listaUsuario.get(i).getNome()+";")
				.append(listaUsuario.get(i).getEmail()+";")
				.append(listaUsuario.get(i).getSenha()+";")
				.append(listaUsuario.get(i).getTelefone()+";")
				.append(listaUsuario.get(i).getTipoUsuario()+"");
			}			
			System.out.println("retorno StringUsuario() "+retorno.toString());
			return retorno.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public UsuarioVO alimentarUsuarioVO(HttpServletRequest request){
		int idUsuario;
		try {
			if(request.getParameter("idUsuario")==null || request.getParameter("idUsuario").equals("")){
				idUsuario=0;
			}else
				idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
			
			int tipo_usuario = Integer.parseInt(request.getParameter("tipoUsuario"));	
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String telefone = request.getParameter("telefone");
			//String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			
			UsuarioVO usuarioVo = new UsuarioVO();
			usuarioVo.setIdUsuario(idUsuario);
			usuarioVo.setTipoUsuario(tipo_usuario);
			usuarioVo.setNome(nome);
			usuarioVo.setEmail(email);
			usuarioVo.setTelefone(telefone);
			//usuarioVo.setLogin(login);
			usuarioVo.setSenha(senha);
			
			return usuarioVo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String getEmail(HttpServletRequest request){
		try {
			 String emailPesquisa = request.getParameter("emailPesquisa");
			return emailPesquisa;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public String getUnicoEmail(HttpServletRequest request){
		try {
			String emailPesquisa = request.getParameter("emailPesquisaGetUsuario");
			return emailPesquisa;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
}
