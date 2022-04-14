package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

/*
 * Um caixa eletronico possui as cédulas:
 * 50,00
 * 20,00
 * 10,00
 * 5,00
 * 
 * Escrever um programa para solicitar ao usuário o valor do saque.
 * Com base no valor vamos apresentar a quantidade de cedula dispensada,
 * considerando que as cédulas de maior valor são liberadas primeiro.
*/
public class Exe01_CaixaEletronico {

	public static void main(String[] args) {
		// solicitar o valor do saque
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saque?"));

		// vamos obter o valor como sendo inteiro.
		int valorSaque = (int) valor; // typecast

		// analisando se o valor é multiplo de 5
		if (valor % 5 != 0) {
			JOptionPane.showMessageDialog(null, "Valor invalido");
			return;
		}
			// toda variavel devemos atribuir um valor.
			int qtde50, qtde20, qtde10, qtde5;
			qtde50 = qtde20 = qtde10 = qtde5 = 0;
			
			qtde50 = valorSaque / 50; // 2 notas de 50
			valorSaque %= 50;
			
			qtde20 = valorSaque / 20; // 2 notas de 20
			valorSaque %= 20;
			
			qtde10 = valorSaque / 10; // 2 notas de 10
			valorSaque %= 10;
			
			qtde5 = valorSaque / 5; // 2 notas de 5
			// valorSaque %= 5;
			
			String resposta = "Valor do saque: " + valor + "\nNotas de 50: " + qtde50 + "\nNotas de 20: " + qtde20
					+ "\nNotas de 10: " + qtde10 + "\nNotas de 5: " + qtde5;
			
			JOptionPane.showMessageDialog(null, resposta);		
	}
}
