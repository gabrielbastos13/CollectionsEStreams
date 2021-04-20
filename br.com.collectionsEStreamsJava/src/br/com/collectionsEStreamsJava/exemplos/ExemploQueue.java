package br.com.collectionsEStreamsJava.exemplos;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

	public static void main(String[] args) {
		 
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Flávio");
		filaBanco.add("Pamela");
		filaBanco.add("Anderson");
		
		String clienteASerAtendido = filaBanco.poll();
		System.out.println(clienteASerAtendido);
		System.out.println(filaBanco);
		String primeiroCliente = filaBanco.peek();
		System.out.println(primeiroCliente);
		System.out.println(filaBanco);
		 
		
	}

}
