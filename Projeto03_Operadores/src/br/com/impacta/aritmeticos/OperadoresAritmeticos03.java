package br.com.impacta.aritmeticos;

public class OperadoresAritmeticos03 {
	public static void main(String[] args) {

		int a = 10, b = 3;

		a *= 2;
		b /= 3;

		a += b;
		b -= (a + 1);

		a %= 2;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
