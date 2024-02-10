package Grafo;

import java.util.List;

public class Aresta {
	
	
	int valor;
	List<No> nos;
	
//	private Vertice v1;
//	private Vertice v2;

	
	
	public Aresta(int valor, List<No> nos) {
		super();
		this.valor = valor;
		this.nos = nos;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public List<No> getNos() {
		return nos;
	}


	public void setNos(List<No> nos) {
		this.nos = nos;
	}
	
	@Override
	public String toString() {
		return "Aresta "+ this.nos.toString();
	}
	

}
