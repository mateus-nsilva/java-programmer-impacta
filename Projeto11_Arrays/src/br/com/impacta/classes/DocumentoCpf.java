package br.com.impacta.classes;

import br.com.impacta.interfaces.Documento;

public class DocumentoCpf implements Documento {

	private String cpf;
	
	public DocumentoCpf(String cpf) {
		super();
		this.setNumero(cpf);
	}

	@Override
	public void setNumero(String numero) {
		//expressão regular
		if(!numero.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}.[0-9]{2}")) {
			throw new NumberFormatException("O CPF deve ter 11 digítos");
		}
		this.cpf = numero;
		
		System.out.println(this.getNumero());
	}

	@Override
	public String getNumero() {
		return this.cpf;
	}

}
