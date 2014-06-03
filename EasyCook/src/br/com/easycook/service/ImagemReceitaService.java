package br.com.easycook.service;

import br.com.easycook.classesVO.ImagemReceitaVO;
import br.com.easycook.implementacao.ImagemReceitaImplementacao;

public class ImagemReceitaService extends ImagemReceitaImplementacao{

	public void inserir_Imagem_Receita_Service(ImagemReceitaVO Imagem_ReceitaVo){
		super.inserirImagemReceita(Imagem_ReceitaVo);
	}
	
	public void alterar_Imagem_Receita_Service(ImagemReceitaVO Imagem_ReceitaVo){
		super.alterarImagemReceita(Imagem_ReceitaVo);
	}
	
	public void excluir_Imagem_Receita_Service(ImagemReceitaVO Imagem_ReceitaVo){
		super.excluirImagemReceita(Imagem_ReceitaVo);
	}
	
	public void pesquisar_Imagem_Receita_Service(ImagemReceitaVO Imagem_ReceitaVo){
		super.pesquisarImagemReceita(Imagem_ReceitaVo);
	}
	
	
	
	
}
