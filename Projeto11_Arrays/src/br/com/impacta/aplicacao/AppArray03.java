package br.com.impacta.aplicacao;

public class AppArray03 {
	public static void main(String[] args) {

		int[] numeros = { 17, 13, 16, 25, 39, 17 };

//		for (int elemento : numeros) {
//			System.out.println(elemento);
//		}

		// Vamos fazer o array 'número' referenciar outro objeto.
		System.out.println();
		numeros = new int[] { 100, 122 };
		
		for (int elemento : numeros) {
			System.out.print(elemento + " ");
		}
	}
}
