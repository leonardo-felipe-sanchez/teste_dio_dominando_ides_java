package br.com.dio;

import br.com.dio.model.gato;

public class Program {

	public static void main(String[] args) {
		
		gato ggato = new gato();
		Livros livros = new Livros();
		
		System.out.println(ggato);
		System.out.println(livros);
//		int a, b;
//		
//		a = 2; b = 3;
//		
//		System.out.println("oimundo " + (a+b));

	}
	

}

class Livros{
	private String nome;
	private String npag;
	
}
