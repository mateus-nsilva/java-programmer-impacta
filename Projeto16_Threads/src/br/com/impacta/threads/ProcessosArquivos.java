package br.com.impacta.threads;

import java.io.FileReader;

public class ProcessosArquivos implements Runnable {

	@Override
	public void run() {
		lerArquivo();
	}
	
	public synchronized void lerArquivo() {
		try {
			FileReader reader = new FileReader("C:\\Eclipse\\Workspace\\Arquivos\\arquivo1.txt");
			System.out.println(Thread.currentThread().getName());

			while (true) {
				int caractere = reader.read();
				// EOF = END OF FILE.

				if (caractere == -1)
					break;

				char ch = (char) caractere;
				System.out.print(ch);
				Thread.sleep(200);
			}

			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
