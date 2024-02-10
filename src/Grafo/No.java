package Grafo;

import java.util.List;

public class No {

	String nome;
	List<Aresta> arestas;
	
	
	public No(String nome, List<Aresta> arestas) {
		super();
		this.nome = nome;
		this.arestas = arestas;
	}
	
	public No(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
}
