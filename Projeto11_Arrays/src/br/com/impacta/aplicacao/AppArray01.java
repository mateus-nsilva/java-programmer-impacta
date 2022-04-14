package br.com.impacta.aplicacao;

public class AppArray01 {
	public static void main(String[] args) {
		// definindo array
		int[] numeros = new int[5];
		
		numeros[0] = 20;
		numeros[1] = 10;
		numeros[2] = -12;
		numeros[3] = 0;
		numeros[4] = 8;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		for (int i = numeros.length -1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
		
		//Não é possível redimensionar um array,
		//depois de criado não muda mais.
	}
}
