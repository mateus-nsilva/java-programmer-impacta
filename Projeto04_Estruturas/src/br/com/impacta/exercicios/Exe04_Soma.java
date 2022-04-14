package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Exe04_Soma {

	public static void main(String[] args) {

		// Perguntar para o usu�rio quantos n�meros ele deseja.
		// Esta quantidade dever� ser armazenada em uma variavel.
		int numero = Integer.parseInt(setMessage("Quantos n�meros vc deseja?"));

		// perguntar para o usuario quantos irm�os ele possui,
		// armazenar esse valor em uma variavel chamada irmaos
		int irmaos = Integer.parseInt(setMessage("Quantos irm�os vc tem?"));

		// perguntar em qual cidade ele mora e armazenar em uma variavel
		int cidade = Integer.parseInt(setMessage("Em qual cidade vc mora?"));
		
		// perguntar qual o sal�rio, incluindo os centavos.
		// armazenar em uma variavel
		double salario = Double.parseDouble(setMessage("Em qual cidade vc mora?"));
		
		// declarar uma variavel do tipo String chamada status.
		// Se o salario informado for maior que R$6.000,00, esta variavel deve
		// armazenar:
		// "Voc� est� acima da m�dia." Caso contrario, a variavel deve armazenar: Voc�
		// est�
		// dentro da m�dia.			
		
		String status = "Voc� est� dentro da m�dia";
		
		if(salario > 6000.00) status = "Voc� est� acima da m�dia";
		
		String resposta = "N�mero informado: " + numero +
				"\nQuant. de irm�os: " + irmaos + 
				"\nCidade onde mora: " + cidade +
				"\nSalario: " + salario +
				"\nStatus: " + status;
		
		JOptionPane.showMessageDialog(null, resposta);
	}
	
	private static String setMessage(String message) {
		return JOptionPane.showInputDialog(message);		
	}
	
}
