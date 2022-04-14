package br.com.impacta.utilitarios.Utilitarios1;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		double soma = Utilitarios.somar(12, 15.6);
		System.out.println(soma);

		System.out.println(Utilitarios.removerEspacos("Está chovendo muito"));

		System.out.println(Utilitarios.gerarEmail("Mateus ", "Nascimento"));

		// executando o método calcularMediaArray()
		double[] lista = { 2.3, 4.5, 9.1, 10, 8 };
		double media = Utilitarios.calcularMediaArray(lista);

		System.out.println("Media dos elementos do array: " + media);

		// executando o método calcularMediaNumeros
		double m1 = Utilitarios.calcularMediaNumeros();
		double m2 = Utilitarios.calcularMediaNumeros(2, 3);
		double m3 = Utilitarios.calcularMediaNumeros(9, 8, 4, 6, 1, 7, 6, 0);
		double m4 = Utilitarios.calcularMediaNumeros(lista);
		
		System.out.println("Array M1: " + m1);
		System.out.println("Array M2: " + m2);
		System.out.println("Array M3: " + m3);
		System.out.println("Array M4: " + m4);
	}
}
