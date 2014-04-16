package br.com.easycook.Interface;

import br.com.easycook.classesVO.ImagemReceitaVO;

public interface ImagemReceitaInterface {
	
	public boolean inserirImagemReceita(ImagemReceitaVO Imagem_ReceitaVo);
	public boolean alterarImagemReceita(ImagemReceitaVO Imagem_ReceitaVo);
	public boolean excluirImagemReceita(ImagemReceitaVO Imagem_ReceitaVo);
	public boolean pesquisarImagemReceita(ImagemReceitaVO Imagem_ReceitaVo);
	

}
