package br.com.impacta.aplicacao;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.codigo = 1;
		produto.categoria = "Roupa";
		produto.descricao = "Camiseta";
		produto.preco = 100.00;
		
	}
}
