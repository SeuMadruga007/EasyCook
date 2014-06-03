package br.com.easycook.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import br.com.easycook.classesVO.EstiloVidaVO;
import br.com.easycook.classesVO.UsuarioVO;
import br.com.easycook.implementacao.EstiloVidaImplementacao;

public class EstiloVidaService extends EstiloVidaImplementacao {

	public boolean inserirEstiloVidaService(EstiloVidaVO estiloVidaVo){
		return super.inserirEstilovida(estiloVidaVo);
	}
	
	public boolean alterarEstiloVidaService(EstiloVidaVO estiloVidaVo){
		return super.alterarEstilovida(estiloVidaVo);
	}
	
	public boolean excluirEstiloVidaService(EstiloVidaVO estiloVidaVo){
		return super.excluirEstilovida(estiloVidaVo);
	}
	
	public ArrayList<EstiloVidaVO> pesquisarEstiloVidaService(/*EstiloVidaVO estiloVidaVo*/){
		return super.pesquisarEstiloVida(/*estiloVidaVo*/);
	}
	
	public EstiloVidaVO alimentarEstiloVidaVO(HttpServletRequest request){
		try {
			String nome = request.getParameter("estiloVida");
			String idEstiloVida = request.getParameter("id");
			if(idEstiloVida==null||idEstiloVida.equals("")){
				idEstiloVida="0";
			}
			
			EstiloVidaVO estiloVida = new EstiloVidaVO();
			estiloVida.setEstiloVida(nome);
			estiloVida.setIdEstiloVida(Integer.parseInt(idEstiloVida));
			
			return estiloVida;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String stringEstiloVida(ArrayList<EstiloVidaVO> listaEstiloVida){
		try {
			StringBuilder retorno = new StringBuilder();
			
			for (int i = 0; i < listaEstiloVida.size(); i++) {
				if((i+1)==listaEstiloVida.size()){
					retorno.append(listaEstiloVida.get(i).getIdEstiloVida()+"(#)")
					.append(listaEstiloVida.get(i).getEstiloVida()+"");
				}else{
					retorno.append(listaEstiloVida.get(i).getIdEstiloVida()+"(#)")
					.append(listaEstiloVida.get(i).getEstiloVida()+";");
				}
				
				
			}			
			return retorno.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public String estiloVidaString(ArrayList<EstiloVidaVO> arrayList){
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
	}
	
	
	
}
