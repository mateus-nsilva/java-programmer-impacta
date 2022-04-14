package br.com.impacta;

import javax.swing.JOptionPane;

public class TerceiroPrograma {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "importando pacotes");

		// Códigos adicionais
		String inputUser = JOptionPane.showInputDialog("Digite o seu nome");
		if (inputUser.equalsIgnoreCase("mateus")) {
			JOptionPane.showMessageDialog(null, "Nome válido");
		} else {
			System.out.println(inputUser);
		}
	}
}
