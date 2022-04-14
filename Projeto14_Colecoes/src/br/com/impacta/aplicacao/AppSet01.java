package br.com.impacta.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {

	public static void main(String[] args) {
		// HashSet � a cole��o mais eficiente que existe, pois ele analisa o hash e
		// ordena pelo que for mais r�pido pra ele.
		
		Set<String> nomes = new HashSet<>();
		nomes.add("Daniel");
		nomes.add("Edgard");
		nomes.add("Edson");
		nomes.add("Kelly");
		nomes.add("Cecilia");
		nomes.add("Bruno");
		nomes.add("Kelly");

		nomes.forEach(s -> System.out.println(s));
	}

}
