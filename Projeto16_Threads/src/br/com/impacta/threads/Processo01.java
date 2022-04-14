package br.com.impacta.threads;

public class Processo01 implements Runnable {

	@Override
	public void run() {
		//Run é uma tarefa que vai ser executado pela thread
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println("*");
				Thread.sleep(500);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}

}
