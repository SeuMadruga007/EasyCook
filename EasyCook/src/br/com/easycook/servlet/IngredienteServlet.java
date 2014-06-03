package br.com.easycook.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.easycook.classesVO.IngredienteVO;
import br.com.easycook.service.IngredienteService;

/**
 * Servlet implementation class Ingrediente_Servlet
 */
@WebServlet("/IngredienteServlet")
public class IngredienteServlet extends HttpServlet {
	
	
	IngredienteService service;
	IngredienteVO ingredienteVo;
	String btnAcao ="" ; 
	String ingrediente = "";
	PrintWriter out;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngredienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("pASSOU iNGREDIENTE!");
		
		try {
			btnAcao = request.getParameter("btnAcao"); 
			ingrediente = request.getParameter("ingrediente");
			out = response.getWriter();
			
			if(btnAcao!=null || btnAcao.equals("btnInserirIngrediente")){
				System.out.println("not null");
				service = new IngredienteService();
				ingredienteVo = new IngredienteVO();
				ingredienteVo.setNomeIngrediente(ingrediente);
				
				boolean inseriu = service.inserirIngredienteService(ingredienteVo);
				
				if(inseriu==true){
					out.write("sucesso");
				}else
					out.write("falha");
				
				
			}else if(btnAcao!=null || btnAcao.equals("btnExcluirIngrediente")){
				System.out.println("ExcluirIngrediente");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
