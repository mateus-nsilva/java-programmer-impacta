package br.com.impacta.utilitarios;

public class Utilitarios {
	public static double somar(double x, double y) {
		return x + y;
	}
	
	// escrever um método que receba como parametro um texto e retorone este texto sem espaços.	
	public static String removerEspacos(String texto) {
		//trocar            //antigo //novo
		return texto.replace(" ", "");
	}
	
	//escrever um método que receba como parametro um nome e um sobrenome e retorne
	//email no formato:nome.sobrenome@impacta.com.br
	public static String gerarEmail(String nome, String sobrenome) {
		String padraoEmail = nome + "." + sobrenome + "@impacta.com.br";
		
		return removerEspacos(padraoEmail.toLowerCase());
	}
	
}
