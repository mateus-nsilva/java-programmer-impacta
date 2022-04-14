package br.com.impacta.aplicacao;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import br.com.impacta.interfaces.Operacao02;

public class AppOperacao02 {

	public static void main(String[] args) {
		Operacao02 op = () -> Math.random();
		Operacao02 op2 = () -> Double.parseDouble("123.4");
		
		Operacao02 op3 = () -> {
			double n = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número"));
			
			return n;
		};
		
		System.out.println(
				new DecimalFormat("#.##").format(op.executar()));
		System.out.println(op2.executar());
		System.out.println(op3.executar());
	}
}
