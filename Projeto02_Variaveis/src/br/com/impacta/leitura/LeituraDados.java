package br.com.impacta.leitura;

import javax.swing.JOptionPane;

public class LeituraDados {
	public static void main(String[] args) {
		String usuario = JOptionPane.showInputDialog("digite o seu nome");

		int idade = Integer.parseInt(JOptionPane.showInputDialog("digite o sua idade"));

		double altura = Double.parseDouble(JOptionPane.showInputDialog("digite o seu altura"));

		String resposta = "Seu nome: " + usuario + "\n" 
						+ "Sua idade: " + idade 
						+ "\nSua altura: " + altura;
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}
