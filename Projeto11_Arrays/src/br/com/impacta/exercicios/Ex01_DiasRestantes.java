package br.com.impacta.exercicios;

import static javax.swing.JOptionPane.showInputDialog;

import javax.swing.JOptionPane;;;

public class Ex01_DiasRestantes {
	public static void main(String[] args) {
		/*
		 * Neste exercicio, o usuário deve fornecer: dia, mes, ano
		 * 
		 * Como base nestas informações, determinar quantos dias restam para o ano
		 * informado terminar.
		 */
		int dia = Integer.parseInt(showInputDialog(null, "Informe o dia"));
		int mes = Integer.parseInt(showInputDialog(null, "Informe o mes"));
		int ano = Integer.parseInt(showInputDialog(null, "Informe o ano"));

		if (mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Mês inválido");
			return;
		}

		int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// dividimos o ano por 4 e pegamos o resto da divisão.
		// se for 0 o ano é bissexto.
		if (ano % 4 == 0) {
			meses[1] = 29;
		}

		if (dia < 1 || dia > meses[mes - 1]) {
			JOptionPane.showMessageDialog(null, "Dia inválido");
			return;
		}

		// calculo de número de dias restantes.
		int diasRestantes = meses[mes-1] - dia;
		
		for (int i = mes; i < meses.length; i++ ) {
			diasRestantes += meses[i];
		}
		
		JOptionPane.showMessageDialog(null, "Faltam " + diasRestantes + " dias para terminar o ano");
	}

}
