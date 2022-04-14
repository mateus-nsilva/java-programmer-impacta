package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Figura;

public class AppClasseInterna {

	public static void main(String[] args) {
		// uso de classe interna anônima - COMPLEMENTO
		
		Figura figura = new Figura() {
			
			@Override
			public double calcularArea() {
				// TODO Auto-generated method stub
				return 0;
			}
		};				
		
	}

}
