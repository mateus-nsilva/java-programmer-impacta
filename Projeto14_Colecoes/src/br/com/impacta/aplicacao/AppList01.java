package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppList01 {
	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		nomes.add("Ronaldo");
		nomes.add("Mateus");
		nomes.add(0, "Xcode");
		nomes.add("Alex");

		// cuidado
		// nomes.remove(1);

		// analise de todos os nomes da lista, para remover todos
		// que terminam com S.
		 nomes.removeIf(p -> p.endsWith("s"));

		// apresentando os elementos usando a própria lista.
		System.out.println(nomes);
		System.out.println();

		// usando a estrutura foreach
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println();
		
		// Ordenando a coleção
		Collections.sort(nomes);

		// usando a estrutura forEach()
		nomes.forEach(s -> System.out.println(s));
	}
}
