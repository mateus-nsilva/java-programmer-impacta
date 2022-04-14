package br.com.impacta.interfaces;

// INTERFACE � ABSTRATO POR DEFINI��O
public interface Figura {
	//todos os m�todo de uma interface s�o 
	//publicos e abstratos por defini��o
	
	//public abstract
	double calcularArea();
	
	//todos os atributos de uma interface 
	//s�o publicos, estaticos e constantes (final) por defini��o.
	
	//public static final
	String AUTOR = "Equipe Impacta";
	
	//m�todo default = m�todo definido na interface,
	//acessivel por todos os objetos de todas as classe que implamentarem
	default String apresentarFigura() {
		//this � uma referencia ao objeto da classe que vai implementar.
		
		String resposta = 
				"Class: " + this.getClass().getSimpleName() +
				"\n�rea: " + this.calcularArea();
		return resposta;
	}
}
