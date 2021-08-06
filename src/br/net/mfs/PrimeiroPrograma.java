package br.net.mfs;

import br.net.mfs.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 2;
		int b = 2;
		System.out.println("Hello Word!"+(a + b) ); */
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato ); 
		System.out.println(livros);

	}

}

class Livros {
	
	private String nome;
	
	private String npag;
	
}