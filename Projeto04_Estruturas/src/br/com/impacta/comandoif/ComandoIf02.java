package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf02 {
	public static void main(String[] args) {
		/* 
		 * Um funcionario ter� um valor de 10% de desconto,
		 * Se o sal�rio bruto for superior de 5000 reais.
		 * O desconto ser� calculado sobre a diferen�a 
		 * entre o valor do sal�rio e o valor base de 5000.
		 * */
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio"));
		double desconto = 0;
		
		if(salario > 5000) {
			desconto = (salario - 5000) * 10 / 100; 
		}
		
		String resposta = "Sal�rio bruto: " + salario +
						  "\nDesconto: " + desconto +
						  "\nSal�rio L�quido: " + (salario - desconto);
		
		JOptionPane.showMessageDialog(null, resposta);		
	}
}
