package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {
		Automovel auto = new Automovel("Honda", "Civic");
		Automovel auto2 = new Automovel("Honda", "Civic", 2025, "EEE1234");
		
		JOptionPane.showMessageDialog(null, auto.mostrar());
		JOptionPane.showMessageDialog(null, auto2.mostrar());
	}

}
