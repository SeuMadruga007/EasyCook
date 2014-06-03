package br.com.easycook.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import br.com.easycook.classesVO.IngredienteVO;
import br.com.easycook.implementacao.IngredienteImplementacao;

public class IngredienteService extends IngredienteImplementacao{

	public boolean inserirIngredienteService(IngredienteVO IngredienteVo){
		return super.inserirIngrediente(IngredienteVo);
	}
	
	public boolean alterarIngredienteService(IngredienteVO IngredienteVo){
		return super.alterarIngrediente(IngredienteVo);
	}
	
	public boolean excluirIngredienteService(IngredienteVO IngredienteVo){
		return super.excluirIngrediente(IngredienteVo);
	}
	
	public ArrayList<IngredienteVO> pesquisarIngredienteService(){
		return super.pesquisarIngrediente();
	}
	
	
	
	public IngredienteVO alimentarIngredienteVOService(HttpServletRequest request){
		try {
			String nome = request.getParameter("ingrediente");
			String idCategoria = request.getParameter("id");
			if(idCategoria==null||idCategoria.equals("")){
				idCategoria="0";
			}
			
			IngredienteVO ingredienteVo= new IngredienteVO();
			ingredienteVo.setNomeIngrediente(nome);
			ingredienteVo.setIdIngrediente(Integer.parseInt(idCategoria));
			
			return ingredienteVo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public String stringIngrediente(ArrayList<IngredienteVO> listIngredienteVo){
		try {
			StringBuilder retorno = new StringBuilder();
			
			for (int i = 0; i < listIngredienteVo.size(); i++) {
				if((i+1)==listIngredienteVo.size()){
					retorno.append(listIngredienteVo.get(i).getIdIngrediente()+"(#)")
					.append(listIngredienteVo.get(i).getNomeIngrediente()+"");
				}else{
					retorno.append(listIngredienteVo.get(i).getIdIngrediente()+"(#)")
					.append(listIngredienteVo.get(i).getNomeIngrediente()+";");
				}
				
				
			}			
			return retorno.toString();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	public boolean validarIngredienteService(String categoria) {
		return super.validarIngrediente(categoria);
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
