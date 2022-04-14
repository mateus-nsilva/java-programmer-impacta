package br.com.impacta.classes;

public class ProdutoImportado extends Produto {
	
	private double taxaImportacao;
	private Produto produto;

	@Override
	public String mostrar() {
		return super.mostrar() + 
				"\nTaxa de Importação: " + this.getTaxaImportacao(); 
	}
	public ProdutoImportado(String categoria, String descricao, double preco) {
		super(categoria, descricao, preco);
	}
	
	//sobrecarga
	public ProdutoImportado(String categoria, String descricao, double preco, double taxaImportacao) {
		this(categoria, descricao, preco);
		this.setTaxaImportacao(taxaImportacao);
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
}
