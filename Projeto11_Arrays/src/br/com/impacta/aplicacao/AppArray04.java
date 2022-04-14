package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppArray04 {
	public static void main(String[] args) {
		//O usuário fornece alguns nomes de pessoas para uma lista.
		
		String[] pessoas = new String[4];
		
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = JOptionPane.showInputDialog("informe o nome da pessoa: " + (i+1));
			
			JOptionPane.showMessageDialog(null, 
					"\nIndice do array: " + i + 
					"\nValor do Indice: " + pessoas[i]);
		}
		
		for (String nome_posicao_array : pessoas) {
			System.out.print(nome_posicao_array);
		}
	}
}
