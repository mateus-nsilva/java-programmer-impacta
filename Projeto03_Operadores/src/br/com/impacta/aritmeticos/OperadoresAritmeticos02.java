package br.com.impacta.aritmeticos;

public class OperadoresAritmeticos02 {
	public static void main(String[] args) {

		int a = 10, b = 3, c = 5;

		double d1 = 10, d2 = 3;

		double divisao1 = d1 / d2;
		// parar termos ma divisão real, basta que apenas um dos operadores seja real
		double divisao2 = d1 / b;

		// typecast do a(int) para double.
		double divisao3 = (double) a / c;

		System.out.println("divisao1: " + divisao1);
		System.out.println("divisao2: " + divisao2);
		System.out.println("divisao3: " + divisao3);
	}
}
