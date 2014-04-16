package br.com.easycook.service;

import br.com.easycook.classesVO.ImagemVO;
import br.com.easycook.implementacao.ImagemImplementacao;

public class ImagemService extends ImagemImplementacao{

	public void inserir_Imagem_Service(ImagemVO ImagemVo){
		super.inserirImagem(ImagemVo);
	}
	
	public void alterar_Imagem_Service(ImagemVO ImagemVo){
		super.alterarImagem(ImagemVo);
	}
	
	public void excluir_Imagem_Service(ImagemVO ImagemVo){
		super.excluirImagem(ImagemVo);
	}
	
	public void pesquisar_Imagem_Service(ImagemVO ImagemVo){
		super.pesquisarImagem(ImagemVo);
	}
	
	
	
	
}
