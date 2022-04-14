package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimofirsmo02 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Joel", 29, Sexo.MASCULINO, "Dev", 35);
		Aluno p2 = new Aluno("Mateus", 22, Sexo.MASCULINO, 1234, new Curso(10, "Java", 40, 500));

		mostrarPessoa(p1);
		mostrarPessoa(p2);
	}

	private static void mostrarPessoa(Pessoa p) {
		String nomeClasse = p.getClass().getSimpleName(); //Esse trecho de código ele pega o nome da classe
		String resposta  = p.mostrar();
		
		JOptionPane.showMessageDialog(null, "Classe: " + nomeClasse + "\n\n" + resposta);
	}
	
	
}
