package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		
		while (true) {
			String categoria = lerDados("Digite uma categoria");
			String descricao = lerDados("Digite uma descri��o");
			double preco = Double.parseDouble(lerDados("Digite o pre�o"));
			Produto celular = new Produto(descricao, categoria, preco);
			JOptionPane.showMessageDialog(null, celular.mostrar());
			
			int opcao =	JOptionPane.showConfirmDialog(null, 
					"Deseja continuar?", 
					"Confirma��o", 
					JOptionPane.YES_NO_OPTION
				);
			if(opcao == JOptionPane.NO_OPTION)
				break;
		}
	}
	
	private static String lerDados(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
	
}
