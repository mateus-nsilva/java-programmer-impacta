package br.com.impacta;

import javax.swing.JOptionPane;

public class TerceiroPrograma {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "importando pacotes");

		// C�digos adicionais
		String inputUser = JOptionPane.showInputDialog("Digite o seu nome");
		if (inputUser.equalsIgnoreCase("mateus")) {
			JOptionPane.showMessageDialog(null, "Nome v�lido");
		} else {
			System.out.println(inputUser);
		}
	}
}
