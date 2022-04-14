package br.com.impacta.interfaces;

// INTERFACE É ABSTRATO POR DEFINIÇÃO
public interface Figura {
	//todos os método de uma interface são 
	//publicos e abstratos por definição
	
	//public abstract
	double calcularArea();
	
	//todos os atributos de uma interface 
	//são publicos, estaticos e constantes (final) por definição.
	
	//public static final
	String AUTOR = "Equipe Impacta";
	
	//método default = método definido na interface,
	//acessivel por todos os objetos de todas as classe que implamentarem
	default String apresentarFigura() {
		//this é uma referencia ao objeto da classe que vai implementar.
		
		String resposta = 
				"Class: " + this.getClass().getSimpleName() +
				"\nÁrea: " + this.calcularArea();
		return resposta;
	}
}
