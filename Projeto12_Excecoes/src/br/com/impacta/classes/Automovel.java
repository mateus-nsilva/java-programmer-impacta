package br.com.impacta.classes;

public class Automovel implements Comparable<Automovel> {
	// FINALIZED

	// STATIC FINAL TEMOS QUE INFORMAR UM VALOR INICIAL
	// POR OBRIGA��O. FINAL TEMOS QUE INFORMAR ALGO.

	// Quando criamos uma constante (STATIC + FINAL)
	// o nome deve ser maiusculo.
	public static final String PAIS_ORIGEM = "Brasil";

	// atributos
	public String marca;
	public String modelo;
	public int ano;
	public String placa;

	private final int chassi;
	
	// construtores
	public Automovel(String marca, String modelo) {
		this.chassi = (int)(Math.random() * 1000);
		this.setMarca(marca);
		this.setModelo(modelo);
	}
	
	public Automovel(String marca, String modelo, int ano, String placa) {
		this(marca, modelo);
		this.setPlaca(placa);
		this.setAno(ano);
	}

	public String mostrar() {
		String titulo = "DADOS DO AUTOM�VEL";

		String resposta = titulo + 
				"\n\nMarca: " + this.getMarca() +
				"\nModelo: " + this.getModelo() + 
				"\nChassi: " + this.getChassi();			
		
		if(this.getAno() > 0)
			resposta += "\nAno: " + this.getAno();
		
		if(this.getPlaca() != null) {
			resposta += "\nPlaca: " + this.getPlaca();
		}
		resposta += "\nPais: " + PAIS_ORIGEM;

		return resposta;
	}

	public String mostrar(String titulo) {
		String resposta = titulo + 
				"\n\nMarca: " + this.getMarca() + 
				"\nModelo: " + this.getModelo() + 
				"\nAno: " + this.getAno() + 
				"\nPais: " + PAIS_ORIGEM + 
				"\nPlaca: " + this.getPlaca() + 
				"\nChassi: " + this.getChassi();

		return resposta;
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
			throw new NumberFormatException("O ano n�o pode ser menor do que 1970.");
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

	public int getChassi() {
		return chassi;
	}
	
	@Override
	public int compareTo(Automovel automovel_atual) {
		if(this.getMarca().compareToIgnoreCase(automovel_atual.getMarca()) == 0) {
			return this.getMarca().compareToIgnoreCase(automovel_atual.getMarca());
		}
		
		return this.getMarca().compareToIgnoreCase(automovel_atual.getMarca());
	}
}
