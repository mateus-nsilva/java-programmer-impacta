package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {
		Automovel auto = new Automovel();
		auto.marca = "Honda";
		auto.modelo = "Civic";
		auto.ano = 2019;
		auto.placa = "EBB1234";	
		auto.cor = "Cinza";
		
		Automovel auto2 = new Automovel();
		auto2.marca = "Chevrolet";
		auto2.modelo = "Celta";
		auto2.ano = 2010;
		auto2.placa = "AAA4564";		
		auto2.cor = "Preto";		

		String automovel = "Marca: " + auto.marca + 
						"\nModelo: " + auto.modelo + 
						"\nAno: " + auto.ano + 
						"\nCor: " + auto.cor + 
						"\nPlaca: " + auto.placa;
		
		String automovel2 = "Marca: " + auto2.marca + 
				"\nModelo: " + auto2.modelo + 
				"\nAno: " + auto2.ano + 
				"\nCor: " + auto2.cor + 
				"\nPlaca: " + auto2.placa;

		JOptionPane.showMessageDialog(null, automovel);
		JOptionPane.showMessageDialog(null, automovel2);

	}
}
