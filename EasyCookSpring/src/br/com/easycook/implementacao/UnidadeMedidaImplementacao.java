package br.com.easycook.implementacao;

import br.com.easycook.Interface.UnidadeMedidaInterface;
import br.com.easycook.classesVO.UnidadeMedidaVO;
import br.com.easycook.util.Conexao;

public class UnidadeMedidaImplementacao implements UnidadeMedidaInterface{
	Conexao objConexao = new Conexao();
	
	@Override
	public boolean inserirUnidadeMedida(UnidadeMedidaVO unidadeMedidaVo) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append(" insert into Unidade_Medida values ( ")
				.append("'"+unidadeMedidaVo.getUnidadeMedida()+"')");
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean alterarUnidadeMedida(UnidadeMedidaVO unidadeMedidaVo) {
		try {
			StringBuffer sql = new StringBuffer();
			
			sql.append(" update Unidade_Medida set  ")
			   .append(" Unidade =	"+unidadeMedidaVo.getIdUnidade_medida()+", ")
			   .append(" where idUnidade_Medida = "+unidadeMedidaVo.getIdUnidade_medida());
			
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}		
	}

	@Override
	public boolean excluirUnidadeMedida(UnidadeMedidaVO unidadeMedidaVo) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append(" delete from Unidade_Medida ")
				.append(" where Unidade="+unidadeMedidaVo.getUnidadeMedida());
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean pesquisarUnidadeMedida(UnidadeMedidaVO unidadeMedidaVo) {
		// TODO Auto-generated method stub
		return false;
	}

}
