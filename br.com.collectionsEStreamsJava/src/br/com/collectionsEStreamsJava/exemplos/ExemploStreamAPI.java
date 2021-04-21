package br.com.collectionsEStreamsJava.exemplos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

	public static void main(String[] args) {
		
		List<String> estudantes = new ArrayList<>();
		
		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcelo");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Rafael");
		
		//contagem de elementos
		System.out.println("Contagem: " + estudantes.stream().count());
		
		//Retorna o elemento com maior numero de letras
		System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		//Retorna o elemento com menor numero de letras
		System.out.println("Maior numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
	
		// Retorna os elementos que tem a letra R no nome
		System.out.println("Com a letra r no nome: " + estudantes.stream().filter((estudante) ->
				estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
		
		System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
		estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
		
		System.out.println("Retorna os 3 primeiros elementos da coleção" + estudantes.stream().limit(3).collect(Collectors.toList()));
		
		System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
		
		//exibe elementos no console sem retornar outra coleção
		estudantes.stream().forEach(System.out::println);
		
		System.out.println("todos elementos com W no nome ? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));
		System.out.println("Tem algum elemento com a minusculo no nome ? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));
		System.out.println("nao tem nenhum elemento com a letra a minusculo no nome??? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));
		
		System.out.println("Retorna o primeiro elemento da coleção: " );
		estudantes.stream().findFirst().ifPresent(System.out::println);
		
		
		//OPERAÇÃO ENCADEADA 
		System.out.println("Operação encadeada:  ");
		System.out.println(estudantes.stream()
				.peek(System.out::println)
				.map(estudante ->
					estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println)
				.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
						
				
	}

}
