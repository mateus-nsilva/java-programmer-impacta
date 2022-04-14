package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel02 {
	public static void main(String[] args) {		
		
		Automovel auto1 = new Automovel();
		auto1.lerDados("Azul", "Civic", 2021, "EEE1234", "Honda");
		
		
		Automovel auto2 = auto1;
		auto2.setAno(2023);
		
		JOptionPane.showMessageDialog(null, auto1.mostrar());
	}
}
