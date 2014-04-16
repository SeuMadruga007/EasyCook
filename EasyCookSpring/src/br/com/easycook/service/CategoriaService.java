package br.com.easycook.service;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import br.com.easycook.classesVO.CategoriaVO;
import br.com.easycook.classesVO.CategoriaVO;
import br.com.easycook.implementacao.CategoriaImplementacao;

public class CategoriaService extends CategoriaImplementacao{

	public void inserir_Categoria_Service(CategoriaVO categoriaVo){
		super.inserirCategoria(categoriaVo);
	}
	
	public boolean alterarCategoriaService(CategoriaVO categoriaVo){
		return super.alterarCategoria(categoriaVo);
	}
	
	public boolean excluirCategoriaService(CategoriaVO categoriaVo){
		return super.excluirCategoria(categoriaVo);
	}
	
	public ArrayList<CategoriaVO>  pesquisarCategoriaService() throws SQLException{
		return super.pesquisarCategoria();
	}
	
	public CategoriaVO alimentarCategoriaVO(HttpServletRequest request){
		try {
			String nome = request.getParameter("categoria");
			String idCategoria = request.getParameter("id");
			if(idCategoria==null||idCategoria.equals("")){
				idCategoria="0";
			}
			
			CategoriaVO categoria = new CategoriaVO();
			categoria.setNomeCategoria(nome);
			categoria.setIdCategoria(Integer.parseInt(idCategoria));
			
			return categoria;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public String stringCategoria(ArrayList<CategoriaVO> listCategoriaVo){
		try {
			StringBuilder retorno = new StringBuilder();
			
			for (int i = 0; i < listCategoriaVo.size(); i++) {
				if((i+1)==listCategoriaVo.size()){
					retorno.append(listCategoriaVo.get(i).getIdCategoria()+"(#)")
					.append(listCategoriaVo.get(i).getNomeCategoria()+"");
				}else{
					retorno.append(listCategoriaVo.get(i).getIdCategoria()+"(#)")
					.append(listCategoriaVo.get(i).getNomeCategoria()+";");
				}
				
				
			}			
			return retorno.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	/*
	public String estiloVidaString(ArrayList<CategoriaVO> arrayList){
		try {
			StringBuilder retorno = new StringBuilder();
			if(arrayList.size()==0){
				return null;
			}else{
			for (int i = 0; i < arrayList.size(); i++) {
				if((i+1)==arrayList.size()){
					retorno.append(arrayList.get(i).getEstiloVida());
				}else
					retorno.append(arrayList.get(i).getEstiloVida()+";");
			}
			return retorno.toString();
		}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}*/
	
}
