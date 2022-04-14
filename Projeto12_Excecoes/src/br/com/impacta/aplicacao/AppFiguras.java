package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Retangulo;

public class AppFiguras {
	
	public static void main(String[] args) {
		Retangulo ret = new Retangulo(10, 15);
		
		Circulo cir = new Circulo(5);
		
		JOptionPane.showMessageDialog(null, ret.apresentarFigura());
		JOptionPane.showMessageDialog(null, cir.apresentarFigura());
	}
	
}
