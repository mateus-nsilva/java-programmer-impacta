package br.com.impacta.estruturafor;

import javax.swing.JOptionPane;

public class EstruturaFor02 {
	public static void main(String[] args) {

		int qtdePessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas temos na sala?"));
		int maior = 0;
		int posicao = 0;
		
		for (int i = 1; i <= qtdePessoas; i++) {
			String pergunta = "Pessoa " + i + "\nQual a idade da pessoa " + i + "?";
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog(pergunta));			
			System.out.println("A idade atual: " + idade);
			
			if(idade > maior) {
				maior = idade;
				System.out.println("A idade atual: " + idade);
				posicao = i;
			}
		}
		
		String resposta = "Maior idade: " + maior + 
				"\nPessoa: " + posicao;
				
		JOptionPane.showMessageDialog(null, resposta);
	}
}
