package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Funcionario extends Pessoa {

	private String cargo;
	private double salario;
	private Pessoa pessoa;
	

	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, int idade, Sexo sexo, String cargo, double salario) {
		super(nome, idade, sexo);
		this.setCargo(cargo);
		this.setSalario(salario);
	}

	@Override
	public String mostrar() {
		return super.mostrar() +
				"\nCargo: " + this.getCargo() +
				"\nSalário: " + this.getSalario();
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}