package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Exe02_Ingressos {

	/* Em um clube, o valor do ingresso é cobrado de acordo 
	 * com a idade do participante.
	 * 
	 * - Se a idade for menor que 18: R$ 20,00
	 * - Entre 18 a 59 anos: R$ 30,00
	 * - Acima de 59 anos: R$ 15,00
	 * 
	 *  Com base nestas informações, escreva o programa que apresente:
	 *  
	 * - idade
	 * - o valor do ingresso
	 * */
	public static void main(String[] args) {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
		int ingresso = 30;
		
		if(idade < 18) {
			ingresso = 20;			
		} else if(idade > 59) {
			ingresso = 15;
		}
		
		JOptionPane.showMessageDialog(null, "O valor do ingresso é de: " + ingresso);	
	}
}
