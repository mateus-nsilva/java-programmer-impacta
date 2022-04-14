package br.com.impacta.utilitarios;

public class Utilitarios {
	public static double somar(double x, double y) {
		return x + y;
	}

	// escrever um método que receba como parametro um texto e retorone este texto
	// sem espaços.
	public static String removerEspacos(String texto) {
		// trocar //antigo //novo
		return texto.replace(" ", "");
	}

	// escrever um método que receba como parametro um nome e um sobrenome e retorne
	// email no formato:nome.sobrenome@impacta.com.br
	public static String gerarEmail(String nome, String sobrenome) {
		String padraoEmail = nome + "." + sobrenome + "@impacta.com.br";

		return removerEspacos(padraoEmail.toLowerCase());
	}

	// escreva um método que recebe como parametro
	// um array de numeros reais, e retorna a media dos elementos do array
	public static double calcularMediaArray(double[] numeros) {
		double soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}

		return numeros.length > 0 ? soma / numeros.length : soma;
	}

	// Variavel nunca pode ter esse tipo (...) varargs
	// apenas como parametro
	public static double calcularMediaNumeros(double... numeros) {
		return calcularMediaArray(numeros);
	}
}
