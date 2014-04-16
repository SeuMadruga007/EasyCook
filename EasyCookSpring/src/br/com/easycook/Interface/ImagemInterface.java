package br.com.easycook.Interface;

import br.com.easycook.classesVO.ImagemVO;

public interface ImagemInterface {
	
	public boolean inserirImagem(ImagemVO ImagemVo);
	public boolean alterarImagem(ImagemVO ImagemVo);
	public boolean excluirImagem(ImagemVO ImagemVo);
	public boolean pesquisarImagem(ImagemVO ImagemVo);

}
