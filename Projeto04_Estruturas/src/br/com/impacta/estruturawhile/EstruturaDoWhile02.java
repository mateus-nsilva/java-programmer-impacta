package br.com.impacta.estruturawhile;

public class EstruturaDoWhile02 {
	public static void main(String[] args) {
		int numero = (int)(Math.random() * 20);
		
		do {
			// fa�a isso
			System.out.println(numero++);
		}
		// at� que isso seh
		while(numero < 10);
		
		System.out.println("--FIM DO PROGRAMA--");
	}
}
