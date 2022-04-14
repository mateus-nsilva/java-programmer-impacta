package br.com.impacta.utilitarios.Utilitarios1;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		double soma = Utilitarios.somar(12, 15.6);
		System.out.println(soma);
		
		System.out.println(Utilitarios.removerEspacos("Está chovendo muito"));
		
		System.out.println(Utilitarios.gerarEmail("Mateus ", "Nascimento"));
	}
}
