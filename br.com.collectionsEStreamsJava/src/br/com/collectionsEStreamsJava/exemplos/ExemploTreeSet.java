package br.com.collectionsEStreamsJava.exemplos;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
	
	public static void main(String[] args) {
	TreeSet<String> treeCapitais = new TreeSet<>();
	
	treeCapitais.add("Porto Alegre");
	treeCapitais.add("Florianópolis");
	treeCapitais.add("Curitiba");
	treeCapitais.add("Sao Paulo");
	treeCapitais.add("Rio de Janeiro");
	treeCapitais.add("Belo Horizonte");
	
	System.out.println(treeCapitais);
	System.out.println(treeCapitais.first());
	System.out.println(treeCapitais.last());
	System.out.println(treeCapitais.lower("Florianópolis"));
	System.out.println(treeCapitais.higher("Sao Paulo"));
	System.out.println(treeCapitais);
	System.out.println(treeCapitais.pollFirst());
	System.out.println(treeCapitais.pollLast());
	System.out.println(treeCapitais);
	
	Iterator<String> iterator = treeCapitais.iterator();
	
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	 
	}
}
