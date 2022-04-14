package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public abstract class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;
	private Sexo sexo;
	private Documento documento;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, int idade, Sexo sexo, Documento documento) throws IllegalAccessException {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setDocumento(documento);
	}

	public String mostrar() {
		String resultado = 
				"Nome: " + this.getNome() + 
				"\nIdade: " + this.getIdade() + 
				"\nSexo: " + this.getSexo() +
		
		(this.getDocumento() instanceof DocumentoCpf ? 
				"\nCPF: " : "\nCNPJ: ")
		+  this.getDocumento().getNumero();

		return resultado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		//trim tira os espaços
		if(nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("O nome foi fornecido incorretamente");
		}
		
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws IllegalAccessException {
		if(idade < 0) {
			throw new IllegalAccessException("A idade não pode ser negativa");
		}
		
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	@Override
	public int compareTo(Pessoa pessoa_atual) {
		return this.getNome().compareTo(pessoa_atual.getNome());
	}

}
