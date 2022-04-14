package br.com.impacta.aplicacao;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

import br.com.impacta.classes.Curso;

public class AppArray08 {
	public static void main(String[] args) {
		// definindo array de cursos
		// solicitando a quantidade de cursos

		int quantidade = parseInt(showInputDialog("Informe a quantidade de cursos: "));

		Curso[] cursos = new Curso[quantidade];

		// solicitando dados do curso para o usuário
		for (int i = 0; i < cursos.length; i++) {
			int codigo = parseInt(showInputDialog("Informe o código do curso: " + (i + 1)));
			String descricao = showInputDialog("Descrição do curso: " + (i + 1));
			int cargaHoraria = parseInt(showInputDialog("Carga horária do curso " + (i + 1)));
			double preco = parseDouble(showInputDialog("Preço do curso: " + (i + 1)));

			cursos[i] = new Curso(codigo, descricao, cargaHoraria, preco);
		}

		Arrays.sort(cursos);

		for (Curso curso : cursos) {
			showMessageDialog(null, curso.mostrar());
		}
	}
}
