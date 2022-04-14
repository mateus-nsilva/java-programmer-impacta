package br.com.impacta.relacionais_logicos;

public class OperadoresLogicos02 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		boolean b1 = (a > 10) || (--b > 0);
		
		// a primeira operação é TRUE
		// o código vai continuar 
		
		System.out.println(" a " + a);
		System.out.println(" b " + b);
		System.out.println(" b1 = " + b1);
	}
}
