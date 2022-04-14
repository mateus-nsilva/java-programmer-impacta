package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;
import br.com.impacta.classes.ProdutoImportado;

public class AppPolimofirsmo03 {
	public static void main(String[] args) {
		
		Produto prod = new Produto("Alimentação", "Batata frita", 50);
		Produto prod2 = new ProdutoImportado("Transporte", "Batata frita", 50);
		
		//Desejamos alterar a taxa de importação para 7.0%
		if(prod2 instanceof ProdutoImportado) {
			((ProdutoImportado) prod2).setTaxaImportacao(7.0);
		}
		
		JOptionPane.showMessageDialog(null, prod.mostrar());
		JOptionPane.showMessageDialog(null, prod2.mostrar());
	}
	
}
