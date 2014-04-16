package br.com.easycook.Interface;

import java.util.ArrayList;

import br.com.easycook.classesVO.EstiloVidaVO;

public interface EstiloVidaInterface {
	
	public boolean inserirEstilovida(EstiloVidaVO estiloVidaVo);
	public boolean alterarEstilovida(EstiloVidaVO estiloVidaVo);
	public boolean excluirEstilovida(EstiloVidaVO estiloVidaVo);
	public ArrayList<EstiloVidaVO> pesquisarEstiloVida(/*EstiloVidaVO estiloVidaVo*/);
	public boolean validarEstiloVida(String estiloVida);

}
