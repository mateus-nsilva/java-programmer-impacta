package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.classes.Produto;

public class AppList03 {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Informática", "Lapop", 4000));
		produtos.add(new Produto("Limpeza", "Sabonte", 3));
		produtos.add(new Produto("Alimentação", "Macarrão", 5));
		produtos.add(new Produto("Informática", "WebCam", 389));
		produtos.add(new Produto("Transporte", "Bicicleta", 2000));
		produtos.add(new Produto("Transporte", "Bicicleta", 2000));
		
		System.out.println("Lista Original:");
		produtos.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		produtos.sort((a, b) -> a.getCategoria().compareTo(b.getCategoria()));
		
//		Collections.sort(produtos, new OrdenacaoDescricao());
		System.out.println("Lista Ordenada por Categoria:");
		
		produtos.forEach(produto -> System.out.println(produto));
	}

}
