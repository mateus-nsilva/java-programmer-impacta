package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile04 {
	/*
	 * Nesse programa, o usuário fornece uma certa quantidade de números. A entrada
	 * de dados termina quando o usuário digitar o número 0.
	 * 
	 * Cada número informado é mostrado na tela
	 * 
	 * Se o usuário digitar um número de No final, o programa deve mostrar a soma e
	 * a quantidade de números informados.
	 */

	public static void main(String[] args) {
		int quantidade = 0;
		int soma = 0;

		while (true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));

			if (numero == 0)
				break;

			if (numero < 0) {
				continue; // continuar para a próxima instrução.
				// (volta para o inicio)
			}
			
			System.out.println(numero);

			soma += numero;
			quantidade++;
		}

		System.out.println("Soma dos números informados: " + soma);
		System.out.println("Quantidade de números informados: " + quantidade);

		// return sai do método;
		// Break interrompe a estrutura
	}
}
