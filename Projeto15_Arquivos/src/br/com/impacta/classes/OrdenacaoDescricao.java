package br.com.impacta.classes;
import java.util.Comparator;

import br.com.impacta.classes.Produto;

public class OrdenacaoDescricao implements Comparator<Produto> {

	@Override
	public int compare(Produto prod1, Produto prod2) {
		return prod1.getDescricao().compareTo(prod2.getDescricao());
	}
}
