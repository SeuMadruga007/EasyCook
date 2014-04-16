package br.com.easycook.implementacao;

import java.sql.SQLException;

import br.com.easycook.Interface.ReceitaInterface;
import br.com.easycook.classesVO.ReceitaVO;
import br.com.easycook.util.Conexao;

public class ReceitaImplementacao implements ReceitaInterface {
	Conexao objConexao = new Conexao();
	@Override
	public boolean inserirReceita(ReceitaVO ReceitaVo) throws SQLException {
		try {
			StringBuilder sql = new StringBuilder();
			
			sql.append("insert into receita values(")
				.append("")
				.append("")
				.append("")
				.append("")
				.append("")
				.append("");
			
			objConexao.executarComando(sql.toString());
			
			return true;
		}catch(NullPointerException npe){
			npe.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean alterarReceita(ReceitaVO ReceitaVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluirReceita(ReceitaVO ReceitaVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pesquisarReceita(ReceitaVO ReceitaVo) {
		// TODO Auto-generated method stub
		return false;
	}

}
