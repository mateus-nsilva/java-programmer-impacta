package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));
		
		if(idade < 18) {
			System.out.println("menor de idade");
		} else {
			System.out.println("menor de idade");
		}		
	}
}
