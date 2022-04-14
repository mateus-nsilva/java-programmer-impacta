package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Exe03_SenhaAlfanumerica {

	/*
	 * Este programa deve gerar uma senha com 6 digítos, onde cada
	 * digíto é um número entre 0 e 9. A senha final é uma String.
	 * */
	public static void main(String[] args) {
		String senha = "";
		
		for (int i = 0; i < 6; i++) {		
			int numeroAtual = (int)(Math.random() * 10);
			senha += numeroAtual;
			System.out.println("Número atual: " + numeroAtual);
		}
		JOptionPane.showMessageDialog(null, "A senha de 6 digitos é " + senha);
	}
}
