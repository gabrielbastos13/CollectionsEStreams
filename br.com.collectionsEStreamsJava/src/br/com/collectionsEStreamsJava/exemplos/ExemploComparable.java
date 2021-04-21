package br.com.collectionsEStreamsJava.exemplos;

public class ExemploComparable implements Comparable<ExemploComparable> {
	
	private final String nome;
	private final Integer idade;
	
	public ExemploComparable(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
		}
	
	public Integer getIdade() {
		return idade;
		}
	
	@Override
	public String toString() {
		return nome + " - " + idade; 
		}
	@Override
	public int compareTo(ExemploComparable o) { 
		return this.getIdade() - o.getIdade();
	}

}
