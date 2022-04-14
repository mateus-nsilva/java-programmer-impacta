package br.com.impacta.aplicacao;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class AppExcecoes04 {
	public static void main(String[] args) {
		try {
			String nome = showInputDialog("Informe seu nome");
			showMessageDialog(null, "Idade informada: " + nome.toUpperCase());
			
			int idade = Integer.parseInt(showInputDialog("Informe sua idade"));
			showMessageDialog(null, "Idade informada: " + idade);
		
		} catch(Exception e) {
			showMessageDialog(null, "Erro Geral: " + e.getMessage());
		}
	}
}
