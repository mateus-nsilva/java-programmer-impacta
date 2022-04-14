package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Operacao01;

public class AppOperacao01 {

	public static void main(String[] args) {

		//EXEMPLO DE EXPRESSÃO LAMBDAS CHAMANDO O MÉTODO SOMAR
		Operacao01 op = parametroDoRetorno -> somar(parametroDoRetorno);
		int retorno = op.executar("10");

		System.out.println(retorno);

		//EXEMPLO DE EXPRESSÃO LAMBDAS PARA EXIBIR A QUANTIDADE DE CARACTERES DA STRING
		Operacao01 op2 = s -> s.length();
		int retorno2 = op2.executar("Curso Java");

		System.out.println(retorno2);

		//EXEMPLO DE EXPRESSÃO LAMBDAS PARA EXIBIR A QUANTIDADE DE CARACTERES SEM ESPAÇOS
		Operacao01 op3 = s -> {
			String t = s.replaceAll(" ", "");
			return t.length();
		};
		int retorno3 = op3.executar("Curso Java");

		System.out.println(retorno3);

		//MESMA COISA DO OP3, SÓ QUE CHAMANDO UM MÉTODO contarPalavras
		Operacao01 op4 = s -> contarPalavras(s);
		int retorno4 = op4.executar("O curso de Java  termina dia 14");

		System.out.println("O números de palavras separada no array é de: " + retorno4);
	}

	private static int somar(String s) {
		return Integer.parseInt(s) * 5;
	}
	
	static int contarPalavras(String s) {
		String texto = s.trim();
		String[] itens = texto.split(" ");
		int contador = 0;
		
		for (String elemento : itens) {
			
			if(elemento.length() > 0) 
				contador++;					
		}

		return contador;
	}
}
