package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setCodigo(Integer.parseInt(lerDados("Digite um código")));
		produto.setCategoria(lerDados("Digite uma categoria"));
		produto.setDescricao(lerDados("Digite uma descrição"));
		produto.setPreco(Integer.parseInt(lerDados("Digite o preço")));
		
		JOptionPane.showMessageDialog(null, produto.mostrar());
	}
	
	private static String lerDados(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
	
}
