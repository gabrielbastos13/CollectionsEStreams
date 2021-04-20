package br.com.collectionsEStreamsJava.exemplos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(4);
		
		
		System.out.println(sequenciaNumerica);
		sequenciaNumerica.remove(4);
		System.out.println(sequenciaNumerica);
		System.out.println(sequenciaNumerica.size());
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		
		for (Integer nota: sequenciaNumerica) {
			System.out.println(nota);
		}
		
		sequenciaNumerica.clear();
		System.out.println(sequenciaNumerica.isEmpty());
		
	}

}
