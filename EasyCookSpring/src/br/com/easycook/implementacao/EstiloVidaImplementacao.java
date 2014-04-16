package br.com.easycook.implementacao;

import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.easycook.Interface.EstiloVidaInterface;
import br.com.easycook.classesVO.EstiloVidaVO;
import br.com.easycook.util.Conexao;

public class EstiloVidaImplementacao implements EstiloVidaInterface{
	Conexao objConexao = new Conexao();
	ArrayList<EstiloVidaVO> arrayEstiloVida;
	EstiloVidaVO estiloVidaVO;
	
	@Override
	public boolean inserirEstilovida(EstiloVidaVO estiloVidaVo) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append(" insert into estilo_vida values ( ")
				.append("'"+estiloVidaVo.getEstiloVida()+"')");
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			objConexao.fecharConexao();
		}
	}

	@Override
	public boolean alterarEstilovida(EstiloVidaVO estiloVidaVo) {
		try {
			
			StringBuffer sql = new StringBuffer();
			
			sql.append(" update estilo_vida set  ")
			   .append(" Tipo_estilo_Vida = '"+estiloVidaVo.getEstiloVida()+"' ")
			   .append(" where idEstilo_Vida = '"+estiloVidaVo.getIdEstiloVida()+"'");
			
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			objConexao.fecharConexao();
		}
	}

	@Override
	public boolean excluirEstilovida(EstiloVidaVO estiloVidaVo) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append(" delete from estilo_vida ")
				.append(" where tipo_estilo_vida='"+estiloVidaVo.getEstiloVida()+"'");
			
			int i = objConexao.executarComando(sql.toString());
			
			if(i!=1){
				return false;
			}else
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			objConexao.fecharConexao();
		}
	}

	@Override
	public ArrayList<EstiloVidaVO> pesquisarEstiloVida(/*EstiloVidaVO estiloVidaVo*/) {
		try {
			arrayEstiloVida = new ArrayList<EstiloVidaVO>();
			StringBuilder sql = new StringBuilder();
			sql.append("select * from estilo_vida");
			
			ResultSet rs = objConexao.executarConsulta(sql.toString());
			
			while(rs.next()){
				estiloVidaVO = new EstiloVidaVO();
				estiloVidaVO.setIdEstiloVida(rs.getInt(1));
				estiloVidaVO.setEstiloVida(rs.getString(2));
				
				arrayEstiloVida.add(estiloVidaVO);
			}
			return arrayEstiloVida;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			objConexao.fecharConexao();
		}
		
	}

	@Override
	public boolean validarEstiloVida(String estiloVida) {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append("select * ")
				.append("from Estilo_Vida ")
				.append("where tipo_estilo_vida = '"+estiloVida.trim()+"'");
			
			ResultSet rs = objConexao.executarConsulta(sql.toString());
			
			if(rs.next()){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	

}
