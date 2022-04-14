package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {
		Automovel auto = new Automovel();
		
		auto.lerDados("Azul", "Civic", 2020, "EEE1234", "Honda");
		String texto = auto.mostrar();
		JOptionPane.showMessageDialog(null, texto);
		
//		Automovel.paisOrigem = "Argentina";
		System.out.println(Automovel.PAIS_ORIGEM);
	}

}
