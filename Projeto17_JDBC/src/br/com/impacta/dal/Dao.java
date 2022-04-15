package br.com.impacta.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;

public abstract class Dao<T,K> {
	String conexao = "jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false";
	
	//Protected = acess�vel para a classe e subclasses.
	protected Connection cn;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	//m�todo para abrir a conexao
	protected void abrirConexao() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		cn = DriverManager.getConnection(conexao, "root", "Imp@ct@");
	}
	
	//m�todo para fechar conexao
	protected void fecharConexao() throws Exception {
		if(cn != null && !cn.isClosed()) {
			cn.close();
		}
	}
	
	public abstract void incluir(T item) throws Exception;
	public abstract void buscar(K id) throws Exception;
	public abstract Collection<T> listar();
	
}
