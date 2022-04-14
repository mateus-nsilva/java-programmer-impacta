package br.com.impacta.classes;

public class Automovel {
	// FINALIZED

	// STATIC FINAL TEMOS QUE INFORMAR UM VALOR INICIAL
	// POR OBRIGAÇÃO. FINAL TEMOS QUE INFORMAR ALGO.

	// Quando criamos uma constante (STATIC + FINAL)
	// o nome deve ser maiusculo.
	public static final String PAIS_ORIGEM = "Brasil";

	// atributos
	public String cor;
	public String modelo;
	public int ano;
	public String placa;
	public String marca;

	public void lerDados(String cor, String modelo, int ano, String placa, String marca) {
		this.setCor(cor);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa);
		this.setMarca(marca);
	}

	public String mostrar() {
		String titulo = "DADOS MOVÉIS";

		String resposta = titulo + "\n\nMarca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nAno: "
				+ this.getAno() + "\nCor: " + this.getCor() + "\nPais: " + PAIS_ORIGEM + "\nPlaca: " + this.getPlaca();

		return resposta;
	}

	public String mostrar(String titulo) {
		String resposta = titulo + "\n\nMarca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nAno: "
				+ this.getAno() + "\nCor: " + this.getCor() + "\nPais: " + PAIS_ORIGEM + "\nPlaca: " + this.getPlaca();

		return resposta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano < 1970) {
			throw new NumberFormatException("O ano não pode ser menor do que 1970.");
		}
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
