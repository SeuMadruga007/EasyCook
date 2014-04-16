package br.com.easycook.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.easycook.classesVO.UsuarioVO;
import br.com.easycook.controle.UsuarioControle;
import br.com.easycook.service.UsuarioService;

@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioVO usuarioVo;  
	UsuarioService service;
	UsuarioControle uControle = new UsuarioControle();
	
	public UsuarioServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.println("Servlet Passou");
			PrintWriter out = response.getWriter();
			String btnAcionado = request.getParameter("btnAcionado");
			
			/*if(btnAcionado!=null && btnAcionado.equals("btnIncluirUsuario")){
				boolean cadastrar = uControle.cadastrarUsuario(alimentarUsuarioVO(request));
				if(cadastrar){
					response.getWriter().write("sucesso");
				}else
					response.getWriter().write("falha");
				
			}else *//*if(btnAcionado!=null  && btnAcionado.equals("btnAlterarUsuario")){
				usuarioVo = new UsuarioVO();
				boolean alterado = uControle.alterarUsuario(alimentarUsuarioVO(request));
				if(alterado){
					response.getWriter().write("sucesso");
				}else
					response.getWriter().write("falha");
				
			}else */if(btnAcionado!=null && btnAcionado.equals("btnPesquisarUsuario")){
				String emailPesquisa = request.getParameter("emailPesquisa");
				response.getWriter().write(uControle.pesquisarUsuario(emailPesquisa));
				
			}else if(btnAcionado!=null && btnAcionado.equals("GetUsuario")){
				String emailPesquisa = request.getParameter("emailPesquisaGetUsuario");
				response.getWriter().write(uControle.pesquisarUnicoUsuario(emailPesquisa));
				
			}/*else if(btnAcionado!=null && btnAcionado.equals("btnExcluirUsuario")){
				String emailPesquisa = request.getParameter("emailPesquisa");
				//out.print();
				boolean excluido = uControle.excluirUsuario(emailPesquisa);
						if(excluido){
							response.getWriter().write("sucesso");
						}else
							response.getWriter().write("falha");
				
			}*//*else if(btnAcionado!=null && btnAcionado.equals("btnLogin")){
				MokUsuario mokUsuario = new MokUsuario();
				
				mokUsuario.setEmail("lucas@hotmail.com");
				mokUsuario.setSenha("123");
				String email = request.getParameter("email");
				String senha = request.getParameter("senha");
				
				if(mokUsuario.getEmail().equals(email)&&mokUsuario.getSenha().equals(senha)){
					response.getWriter().write("sucesso");
				}else
					response.getWriter().write("falha");
				
				
				
				
				
			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private UsuarioVO alimentarUsuarioVO(HttpServletRequest request){
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
			
			usuarioVo = new UsuarioVO();
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
	

}
