package br.com.impacta.classes;

import java.util.List;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public class Aluno extends Pessoa {

	private int matricula;
	private List<Curso> cursos;

	public Aluno() {
		super();
	}

	public Aluno(String nome, int idade, Sexo sexo, Documento documento, int matricula) throws IllegalAccessException {
		super(nome, idade, sexo, documento);
		this.setMatricula(matricula);
	}
	
	@Override
	public String mostrar() {
		return super.mostrar() + "\n\nMatricula: " + this.getMatricula();
				
//				((this.getCurso() == null) ? "\nNenhum curso atribuido" :
//					"\n\n DADOS ALUNO \n\n" + this.getCurso().mostrar());
				
//				"\n\nMatricula: " + this.getMatricula() +
//				"\nCurso: " + this.getCurso().mostrar();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
