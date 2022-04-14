package br.com.impacta.aplicacao;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class AppGravacaoArquivo01 {

	public static void main(String[] args) throws IOException {

		try {
			// Classe FileWriter
			FileWriter writer = new FileWriter("C:\\Eclipse\\Workspace\\Arquivos\\arquivo1.txt");
			String texto = JOptionPane.showInputDialog("Escreva um texto: ");
			writer.write(texto);
			writer.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
