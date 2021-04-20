package br.com.collectionsEStreamsJava.exemplos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		Set<Double> notasAlunos = new HashSet<>();
		
		notasAlunos.add(5.8);
		notasAlunos.add(9.3);
		notasAlunos.add(6.5);
		notasAlunos.add(10.0);
		notasAlunos.add(5.4);
		notasAlunos.add(7.3);
		notasAlunos.add(3.8);
		notasAlunos.add(4.0);
		
		System.out.println(notasAlunos);
		notasAlunos.remove(5.8);
		System.out.println(notasAlunos);
		System.out.println(notasAlunos.size());
		Iterator<Double> iterator = notasAlunos.iterator();
		
		for (Double nota: notasAlunos) {
			System.out.println(nota);
		}
		
		notasAlunos.clear();
		System.out.println(notasAlunos.isEmpty());
		
	}

}
