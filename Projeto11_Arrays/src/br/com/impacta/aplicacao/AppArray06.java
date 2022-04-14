package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppArray06 {
	public static void main(String[] args) {
		
		Automovel[] automoveis =  new Automovel[3];
		
		//instanciar a classe automovel para cada posição
		automoveis[0] = new Automovel("VW", "Fusca", 1972, "BBC1984");
		automoveis[1] = new Automovel("VW", "kombi", 1980, "CVV8874");
		automoveis[2] = new Automovel("Hyundai", "Creta", 2022, "CVV8874");
		
		Arrays.sort(automoveis);
		
		for (Automovel automovel : automoveis) {
			JOptionPane.showMessageDialog(null, automovel.mostrar());
		}
	}
}
