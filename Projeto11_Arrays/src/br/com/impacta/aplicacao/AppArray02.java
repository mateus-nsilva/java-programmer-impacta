package br.com.impacta.aplicacao;

public class AppArray02 {
	public static void main(String[] args) {
		// definindo array de inteiros implicitamente.

		int[] numeros = { 17, 13, 16, 25, 39, 17 };
		
		//apresentar os dados do array utilizando a estrutura 
		//for aprimorada (Java 5.0)
		for (int elemento : numeros) {
			System.out.println(elemento);
		}
		
//		List<Integer> itens = Arrays.asList( 11, 10, 16, 5, 85 );
//        
//		itens.forEach( item -> 
//        	System.out.println(item)
//        );
	}
}
