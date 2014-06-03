package br.com.easycook.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.easycook.classesVO.CategoriaVO;
import br.com.easycook.service.CategoriaService;
import br.com.easycook.service.ReceitaService;

/**
 * Servlet implementation class Receita_Servlet
 */
@WebServlet("/ReceitaServlet")
public class ReceitaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ReceitaService receitaService;   
    CategoriaService categoriaService;
    
    CategoriaVO categoriaVo = new CategoriaVO();    
    ArrayList<String> arrayCategoriaVo;
    PrintWriter out;
    
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceitaServlet() {
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
		try {
			out = response.getWriter();
			receitaService= new ReceitaService();
			out.write(carregarCategoria(response, this.arrayCategoriaVo));
			
			if(request.getParameter("cmbBoxIngrediente")!=null){
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	private String carregarCategoria(HttpServletResponse response, ArrayList<String> arrayCategoriaVo) throws SQLException{
		
		categoriaService = new CategoriaService();
		arrayCategoriaVo = new ArrayList<String>();
		//this.arrayCategoriaVo = categoriaService.pesquisarCategoriaService(arrayCategoriaVo);
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < arrayCategoriaVo.size(); i++) {
			if(i==0){
				result.append(arrayCategoriaVo.get(i)+";");
			}else if(i==(arrayCategoriaVo.size()-1)){
				result.append(arrayCategoriaVo.get(i)+"");
			}else
				result.append(arrayCategoriaVo.get(i)+";");
		}
		return result.toString(); 	
	}
	
}
