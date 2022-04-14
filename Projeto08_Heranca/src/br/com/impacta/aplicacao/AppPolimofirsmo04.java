package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimofirsmo04 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Joel", 29, Sexo.MASCULINO, "Dev", 35);
		Funcionario func = (Funcionario) p1;
		func.setSalario(200);

		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		p1 = new Aluno("Mateus", 22, Sexo.MASCULINO, 1234, new Curso(10, "Java", 40, 500));
		
		//Uma forma de alterar o curso do objeto P1 funcionário. 
		Aluno aluno = (Aluno) p1;
		Curso curso =  new Curso(20, "Angular", 30, 1500);
		
		//Boa prática para verificar se P1 é da mesma instância do Aluno
		if(p1 instanceof Aluno) {
			p1.setIdade(25);
			((Aluno) p1).setCurso(curso);
		}
		
		aluno.setCurso(curso);
		
		//Outra forma de alterar o curso do objeto P1 funcionário.
		((Aluno) p1).setCurso(new Curso(20, "Angular", 30, 1500));
		
		
		
		JOptionPane.showMessageDialog(null, p1.mostrar());
										   //P1.MOSTRAR() - Assumiu a forma do objeto ALUNO
	}
	
}
