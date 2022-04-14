package br.com.impacta.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class AppGravacaoArquivo03 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\Eclipse\\Workspace\\Arquivos\\arquivo1.txt", true);
			
			while(true) {
				String texto = JOptionPane.showInputDialog("Escreva um texto: ");				
				writer.write(texto + "\r\n");
				int opcao = JOptionPane.showConfirmDialog(null,
						"Deseja continuar?", 
						"Confirmação", 
						JOptionPane.YES_NO_OPTION);
				
				if(opcao == JOptionPane.NO_OPTION) {
					break;
				}
			}
			
			writer.close();
			JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
