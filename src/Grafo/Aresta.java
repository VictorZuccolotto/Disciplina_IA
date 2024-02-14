package Grafo;

import java.util.List;

public class Aresta {
	
	
	int valor;
//	List<No> nos;
	
	private No v1;
	private No v2;

	
	
	public Aresta(int valor, List<No> nos) {
		super();
		this.valor = valor;
		this.v1 = nos.get(0);
		this.v2 = nos.get(1);
//		this.nos = nos;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


//	public List<No> getNos() {
//		return nos;
//	}
//
//
//	public void setNos(List<No> nos) {
//		this.nos = nos;
//	}
	
	
	
	
	@Override
	public String toString() {
		return "Aresta "+ this.v1.toString() + " " + this.v2.toString();
	}


	public No getV1() {
		return v1;
	}


	public void setV1(No v1) {
		this.v1 = v1;
	}


	public No getV2() {
		return v2;
	}


	public void setV2(No v2) {
		this.v2 = v2;
	}
	

}
