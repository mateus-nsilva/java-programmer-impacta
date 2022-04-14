package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Exe05_AdivinhaNumero {

	/* O programa produz um número entre 0 e 100.
	 * -iterativamente, programa pede para o usuário digitar um número.
	 * -enquanto o usuario não acertar o numero, o programa vai registrar a tentativa.
	 * 
	 * No final, o programa deve apresentar a msg: "Voce acertou em ? tentivas"
	 * 
	 * Exemplo: o programa geou o numero 59
	 * 
	 * 1- forneça um número entre 0 e 100 = 40
	 * 2- Forneça um número entre 41 e 100 = 65
	 * 3- Forneça um número entre 41 e 64 = 59
	 * 
	 * No final iremos exibir "Voce acertou em 3 tentativas"
	 */
	public static void main(String[] args) {
		int numero = (int) (Math.random() * 100)+1;
		System.out.println(numero);
		int minimo = 0, maximo = 100;
		int tentativas = 0;			
		
		while(true) {
			int valor = Integer.parseInt(
					JOptionPane.showInputDialog("Informe um número entre " + minimo + " e " + maximo)
					);
			
			if(valor > maximo || valor < minimo) {
				continue; // volta para o começo de novo.
			}
			
			tentativas++;
			
			if(valor == numero) {				
				break;
			} else if(valor < numero) {
				minimo = valor + 1;
			} else { 
				maximo = valor - 1;
			}				
		}
		String resposta = "Você acertou em " + tentativas + " tentativas";
		JOptionPane.showMessageDialog(null, resposta);
		
	}	
	
}
