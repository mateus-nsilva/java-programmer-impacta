package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf02 {
	public static void main(String[] args) {
		/* 
		 * Um funcionario terá um valor de 10% de desconto,
		 * Se o salário bruto for superior de 5000 reais.
		 * O desconto será calculado sobre a diferença 
		 * entre o valor do salário e o valor base de 5000.
		 * */
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
		double desconto = 0;
		
		if(salario > 5000) {
			desconto = (salario - 5000) * 10 / 100; 
		}
		
		String resposta = "Salário bruto: " + salario +
						  "\nDesconto: " + desconto +
						  "\nSalário Líquido: " + (salario - desconto);
		
		JOptionPane.showMessageDialog(null, resposta);		
	}
}
