package br.com.impacta.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class AppGravacaoArquivo02 {

	public static void main(String[] args) {
		try {
			String texto = JOptionPane.showInputDialog("Escreva um texto: ");
			FileWriter writer = new FileWriter("C:\\Eclipse\\Workspace\\Arquivos\\arquivo1.txt", true);
			writer.write(texto + "\r\n");
			writer.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
