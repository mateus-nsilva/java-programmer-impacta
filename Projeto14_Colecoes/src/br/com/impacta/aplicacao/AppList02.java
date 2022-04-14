package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.impacta.classes.OrdenacaoCategoria;
import br.com.impacta.classes.Produto;

public class AppList02 {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Informática @", "Lapop", 4000));
		produtos.add(new Produto("Limpeza", "Sabonte <", 3));
		produtos.add(new Produto("Alimentação", "Macarrão", 5));
		produtos.add(new Produto("Informática", "WebCam", 389));
		produtos.add(new Produto("Transporte", "Bicicleta", 2000));
		
		//apresentando os dados, usando o método forEach()
		System.out.println("Lista Original: ");
		produtos.forEach(s -> System.out.println(s));
		
		Collections.sort(produtos, new OrdenacaoCategoria());
		
		System.out.println();
		System.out.println("Lista Ordenada pela Categoria:");
		produtos.forEach(produto -> System.out.println(produto));
	}

}
