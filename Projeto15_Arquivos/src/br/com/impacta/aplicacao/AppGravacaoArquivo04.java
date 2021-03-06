package br.com.impacta.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

import br.com.impacta.enumeracoes.Sexo;

public class AppGravacaoArquivo04 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\Eclipse\\Workspace\\Arquivos\\funcionarios.csv", true);

			// Obtendo os dados de um funcionario
			String nome = JOptionPane.showInputDialog("Nome do Funcionário");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do Funcionário"));
			Sexo sexo = (Sexo) JOptionPane.showInputDialog(null, "Qual o sexo do funcionário", "Sexo",
					JOptionPane.QUESTION_MESSAGE, null, Sexo.values(), null);

			String documento = JOptionPane.showInputDialog("CPF do funcionario");
			String cargo = JOptionPane.showInputDialog("Cargo do funcionario");

			double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do funcionário"));

			// Gerando uma linha com os dados separados pelo caracter ";"
			StringBuilder sb = new StringBuilder();
			sb.append(nome).append(";")
			  .append(idade).append(";")
			  .append(sexo).append(";")
			  .append(documento).append(";")
			  .append(cargo).append(";")
			  .append(salario).append("\n");
			
			writer.write(sb.toString());
			writer.close();
			
			JOptionPane.showMessageDialog(null, "Dados gerados com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} 
	}

}
