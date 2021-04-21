package br.com.collectionsEStreamsJava.exemplos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteExemploComparable {

	public static void main(String[] args) {
		
		List<ExemploComparable> estudantes = new ArrayList<>();
		
		estudantes.add(new ExemploComparable("Pedro", 19));
		estudantes.add(new ExemploComparable("Carlos", 23));
		estudantes.add(new ExemploComparable("Mariana", 21));
		estudantes.add(new ExemploComparable("João", 18));
		estudantes.add(new ExemploComparable("Thiago", 20));
		estudantes.add(new ExemploComparable("George", 22));
		estudantes.add(new ExemploComparable("Larissa", 21));
		
		//método de ordenação
		estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
		System.out.println(estudantes);
		
		//ordenação reversa 
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
		System.out.println(estudantes);
		
		//Método ordenação
		estudantes.sort(Comparator.comparingInt(ExemploComparable::getIdade));
		System.out.println(estudantes);
		
		//Método ordenação reversa
		estudantes.sort(Comparator.comparingInt(ExemploComparable::getIdade).reversed());
		System.out.println(estudantes);
		
	}
}
