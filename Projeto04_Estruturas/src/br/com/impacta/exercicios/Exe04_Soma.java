package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Exe04_Soma {

	public static void main(String[] args) {

		// Perguntar para o usuário quantos números ele deseja.
		// Esta quantidade deverá ser armazenada em uma variavel.
		int numero = Integer.parseInt(setMessage("Quantos números vc deseja?"));

		// perguntar para o usuario quantos irmãos ele possui,
		// armazenar esse valor em uma variavel chamada irmaos
		int irmaos = Integer.parseInt(setMessage("Quantos irmãos vc tem?"));

		// perguntar em qual cidade ele mora e armazenar em uma variavel
		int cidade = Integer.parseInt(setMessage("Em qual cidade vc mora?"));
		
		// perguntar qual o salário, incluindo os centavos.
		// armazenar em uma variavel
		double salario = Double.parseDouble(setMessage("Em qual cidade vc mora?"));
		
		// declarar uma variavel do tipo String chamada status.
		// Se o salario informado for maior que R$6.000,00, esta variavel deve
		// armazenar:
		// "Você está acima da média." Caso contrario, a variavel deve armazenar: Você
		// está
		// dentro da média.			
		
		String status = "Você está dentro da média";
		
		if(salario > 6000.00) status = "Você está acima da média";
		
		String resposta = "Número informado: " + numero +
				"\nQuant. de irmãos: " + irmaos + 
				"\nCidade onde mora: " + cidade +
				"\nSalario: " + salario +
				"\nStatus: " + status;
		
		JOptionPane.showMessageDialog(null, resposta);
	}
	
	private static String setMessage(String message) {
		return JOptionPane.showInputDialog(message);		
	}
	
}
