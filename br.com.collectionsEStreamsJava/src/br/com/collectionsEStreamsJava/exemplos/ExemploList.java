package br.com.collectionsEStreamsJava.exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Carlos");
		nomes.add("Roberto");
		nomes.add("Amanda");
		
		nomes.set(0, "Amanda");
		System.out.println(nomes);
		Collections.sort(nomes);
		System.out.println(nomes);
		nomes.remove(2);
		System.out.println(nomes);
		nomes.remove("Amanda");
		System.out.println(nomes);
		String nomeAmanda = nomes.get(0);
		System.out.println(nomeAmanda);
		System.out.println(nomes.size());
		boolean fernandoExiste = nomes.contains("Fernando");
		System.out.println(fernandoExiste);
		nomes.clear();
		boolean listaVazia = nomes.isEmpty();
		System.out.println(listaVazia);
		
	}

}
