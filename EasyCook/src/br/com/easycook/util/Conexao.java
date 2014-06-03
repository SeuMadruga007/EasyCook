package br.com.easycook.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	
	// 'Constantes'
    public static String BASE_MYSQL 	= "MYSQL";
    public static String BASE_SQLSERVER = "SQLSERVER";

    public Connection con;
    ResultSet rs;
    String conexaoImplementada;
    
    public Conexao() // public constructor
    {
    	
    	//conexaoImplementada = BASE_MYSQL;
    	conexaoImplementada = BASE_SQLSERVER;
    }
    
    public Conexao(String tipoConexao) // public constructor
    {
    	conexaoImplementada = tipoConexao;
    }
    
    public boolean abrirConexao() throws ClassNotFoundException
    {
    	if(conexaoImplementada.equals(BASE_SQLSERVER))
    		return this.abrirConexaoSqlServer();

    	return this.abrirConexaoMySQL();
    }
        
    public boolean abrirConexaoMySQL()
    {
        try
            {
            
                String drv = "com.mysql.jdbc.Driver";             		 // driver a ser utilizado
                String url = "jdbc:mysql://localhost:3306/EasyCook?profileSQL=true";                     // nome da fonte de dados - ODBC 
                Class.forName(drv);                                      //carrega o driver que será utilizado pela aplicação                       
                con = DriverManager.getConnection(url,"root","123456");    //estabelece a conexão
                return true;                                             //permite a utilização de um comando SQL
                                                                         //Fechando a conexão            
            }    
            catch(Exception er1)
            {               
            	er1.printStackTrace();
                return false;
            }  
        
    }
    
    public boolean abrirConexaoSqlServer() throws ClassNotFoundException
    {
        try
            {
        		//Drivers antigos, não está funcionando no Windows 7 64 bits, foi necessário fazer a troca do driver
             	//String drv = "sun.jdbc.odbc.JdbcOdbcDriver";             // driver a ser utilizado
                //String url = "jdbc:odbc:ConexaoAluno";                     // nome da fonte de dados - ODBC 
        	
                String drv = "com.microsoft.sqlserver.jdbc.SQLServerDriver";             // driver a ser utilizado
                String url = "jdbc:sqlserver://localhost;databaseName=EasyCook";           // nome da fonte de dados - ODBC 
                Class.forName(drv);                                      //carrega o driver que será utilizado pela aplicação                       
                con = DriverManager.getConnection(url, "sa", "admin@123");    //estabelece a conexão
                return true;                                             //permite a utilização de um comando SQL
                                                                         //Fechando a conexão            
            }    
            catch(SQLException er1)
            {             
            	
            	er1.printStackTrace();
                return false;
            }  
        
    }
    

    
    
    public ResultSet executarConsulta(String CMD)
    {
         try
            {
                boolean abriuConexao = abrirConexao();                
                rs = null;
                if (abriuConexao)
                {                     
                      Statement MeuState = con.createStatement();  
                      rs = MeuState.executeQuery(CMD);              
                 
                }
                return rs;
            }    
            catch(Exception er1)
            {
            	er1.printStackTrace();
                return null;
            }    
    }


    public int executarComando(String CMD)
    {
         try
             {
            int retorno = 0;
            boolean abriuConexao = abrirConexao();
            
            if (abriuConexao)
            {                     
                  Statement MeuState = con.createStatement();  
                  retorno = MeuState.executeUpdate(CMD);              
            }
            	return retorno;
            }    
            catch(Exception er1)
            {
            	er1.printStackTrace();
            	return 0;
            }    
    }


    public void fecharConexao(){
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
   
    
}










/*
import java.sql.*;

public class Conexao {

	public static void main(String args[]) {

		// Criando as variáveis de conexão e de statement
		Connection con;
		Statement stmt;
		String query = "select * from aluno";

		// Verificando se o driver JDBC está instalado e pode ser utilizado
		try {
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			// Abrindo a conexão com o servidor MAURO, login sa e sem senha
			//con = DriverManager.getConnection("jdbc:microsoft:sqlserver://localhost:1433", "sa", "admin@123");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=WebApp", "sa", "admin@123");
			 
			stmt = con.createStatement();
			// Criando a instrução a partir do SELECT que está dentro da
			// variável query
			ResultSet rs = stmt.executeQuery(query);

			System.out.println("Lista de linhas da tabela sysobjects:");

			// Fazendo um loop para mostrar tudo o que foi retornado do banco
			while (rs.next()) {

				// Obtendo o campo name em um string
				String s = rs.getString(1);
				// Obtendo o campo id em um inteiro
				String s2 = rs.getString(2);
				String s3 = rs.getString(3);
				System.out.println(s + "   " + s2+"   "+s3);
			}

			// Fechamdno a instrução e a conexão
			stmt.close();
			con.close();

		} catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}*/
