package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {
	/*
	 * Nesse programa, o usu�rio fornece uma certa quantidade de n�meros.
	 * A entrada de dados termina quando o usu�rio digitar o n�mero 0.
	 * 
	 * No final, o programa deve mostrar a soma e a quantidade de n�meros informados.
	 */
	
	public static void main(String[] args) {
		int quantidade = 0;
		int soma = 0;
		
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um n�mero"));
			
			if(numero == 0) break;
			
			soma += numero;
			quantidade++;
		}
		
		System.out.println("Soma dos n�meros informados: " + soma);
		System.out.println("Quantidade de n�meros informados: " + quantidade);
	}
}
