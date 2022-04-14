package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimofirsmo01 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Joel", 29, Sexo.MASCULINO, "Dev", 35);

		JOptionPane.showMessageDialog(null, p1.mostrar());
											//P1.MOSTRAR() - Assumiu a forma do objeto	
		// Quem executa o método é o objeto, NUNCA a variavel.
		
		p1 = new Aluno("Mateus", 22, Sexo.MASCULINO, 1234, 
				new Curso(10, "Java", 40, 500));
		
		JOptionPane.showMessageDialog(null, p1.mostrar());
										   //P1.MOSTRAR() - Assumiu a forma do objeto ALUNO
	}
	
}
