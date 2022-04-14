package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppArray05 {
	public static void main(String[] args) {
		//O usuário fornece alguns nomes de pessoas para uma lista.
		
		int quantidade = Integer.parseInt(
				JOptionPane.showInputDialog("Informe uma quantidade de nomes"));
		
		if(quantidade < 0) {
			JOptionPane.showMessageDialog(null, "A quantidade deve ser maior que zero!",
					"Erro", 
					JOptionPane.ERROR_MESSAGE);
			
			return;
		}
		
		String[] nomes = new String[quantidade];
		
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("informe o nome da pessoa: " + (i+1));
		}
		
		//Deixa o array em ordem alfabetica
		Arrays.sort(nomes);
		
		for (String nome_posicao_array : nomes) {
			System.out.println(nome_posicao_array);
		}
	}
}
