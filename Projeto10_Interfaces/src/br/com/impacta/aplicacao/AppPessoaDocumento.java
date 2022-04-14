package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.DocumentoCnpj;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoaDocumento {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Mateus Nascimento");
		funcionario.setIdade(22);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Developer");
		funcionario.setSalario(50000);
//		funcionario.setDocumento(new DocumentoCpf("23099339024"));
		funcionario.setDocumento(new DocumentoCnpj("18053332000108"));
		
		JOptionPane.showMessageDialog(null, funcionario.mostrar());
	}
}
