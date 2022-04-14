package br.com.impacta.aplicacao;

import br.com.impacta.threads.ContadorThread;

public class AppThread01 {

	public static void main(String[] args) {
		try {
			ContadorThread t1 = new ContadorThread();
			t1.start();
			
			for (int i = 0; i < 20; i++) {
				System.out.print(".");
				Thread.sleep(250);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
