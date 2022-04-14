package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {

		try {
			// Pessoa pessoa = new Pessoa();
			// pessoa.setNome("Mateus");
			// pessoa.setIdade(22);
			// pessoa.setSexo(Sexo.MASCULINO);

			// instancia da classe funcionario
			Pessoa funcionario = new Funcionario();
			funcionario.setNome("Joel");
			funcionario.setIdade(30);
			funcionario.setSexo(Sexo.MASCULINO);
			((Funcionario) funcionario).setCargo("Programador");
			((Funcionario) funcionario).setSalario(5000);
			JOptionPane.showMessageDialog(null, funcionario.mostrar());
			//
			Curso curso = new Curso(123, "Java Programmer", 50, 300);
			// curso.setCargaHoraria(300);
			// curso.setCodigo(123);
			// curso.setDescricao("Java");
			// curso.setPreco(2500);

			JOptionPane.showMessageDialog(null, curso.mostrar());

			Pessoa aluno = new Aluno();
			aluno.setNome("Joel");
			aluno.setIdade(30);
			aluno.setSexo(Sexo.MASCULINO);
			((Aluno) aluno).setMatricula(01);
			// aluno.setCurso(curso);
			// aluno.setCurso(new Curso(222, "Java Programmer", 100, 1000));

			JOptionPane.showMessageDialog(null, aluno.mostrar());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
