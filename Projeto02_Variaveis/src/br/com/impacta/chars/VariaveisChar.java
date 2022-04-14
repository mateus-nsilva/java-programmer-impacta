package br.com.impacta.chars;

import javax.swing.JOptionPane;

public class VariaveisChar {
	public static void main(String[] args) {
		char ch1 = 'X';
		char ch2 = 65;
		char ch3 = '\r';
		char ch4 = 2754;

		System.out.println("ch1: " + ch1);
		System.out.println("ch2: " + ch2);
		System.out.println("ch3: " + ch3);
		// O Eclipse é baseadp no ascii (UTF-8) por isso ficou um ?
		System.out.println("ch4: " + ch4);

		JOptionPane.showMessageDialog(null, "ch4: " + ch4);
	}
}
