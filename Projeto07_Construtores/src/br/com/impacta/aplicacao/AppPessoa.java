package br.com.impacta.aplicacao;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Mateus";
		pessoa.idade = 22;
		pessoa.sexo = Sexo.MASCULINO;
	}
}
