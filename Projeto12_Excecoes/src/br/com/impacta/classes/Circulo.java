package br.com.impacta.classes;

import br.com.impacta.interfaces.Figura;

public class Circulo implements Figura, Comparable<Circulo> {
//	private double pi = Math.PI;
	
	private double raio;

	public Circulo(double raio) {
		this.setRaio(raio);
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		// PI * Raio ao quadrado
								  //base		//expoente 		
		return Math.PI * Math.pow(this.getRaio(), 2);
	}

	@Override
	public int compareTo(Circulo o) {
		return 0;
	}
	
}
