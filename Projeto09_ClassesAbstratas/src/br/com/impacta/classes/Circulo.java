package br.com.impacta.classes;

public class Circulo extends Figura {
//	private double pi = Math.PI;
	
	private double raio;

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
	
	
}
