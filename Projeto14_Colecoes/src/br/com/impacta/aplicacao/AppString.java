package br.com.impacta.aplicacao;

import br.com.impacta.classes.Curso;

public class AppString {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
	
		System.out.println("s1 == s2 ? " + (s1 == s2));
		
		String s3 = new String("Java");
		String s4 = new String("Java");
	
		System.out.println("s1 == s2 ? " + (s3.equals(s4)));
		
		Curso c1 = new Curso(300, "C#", 8, 2000);
		Curso c2 = new Curso(300, "C#", 8, 2000);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
//		cursos.add(new Curso(100, "PHP", 100, 1200));
	}

}
