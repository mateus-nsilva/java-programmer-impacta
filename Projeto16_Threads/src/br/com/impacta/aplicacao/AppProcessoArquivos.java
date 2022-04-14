package br.com.impacta.aplicacao;

import br.com.impacta.threads.ProcessosArquivos;

public class AppProcessoArquivos {

	public static void main(String[] args) {
		ProcessosArquivos processo = new ProcessosArquivos();
		
		Thread t1 = new Thread(processo);
		t1.start();
		
		Thread t2 = new Thread(processo);
		t2.start();
	}

}
