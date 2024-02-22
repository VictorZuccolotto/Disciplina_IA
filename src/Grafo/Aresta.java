package Grafo;

public class Aresta {
	
	
	int valor;
	
	private No v1;
	private No v2;

	
	public Aresta(int valor, No v1, No v2) {
		this.valor = valor;
		this.v1 = v1;
		this.v2 = v2;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
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
	
	@Override
	public String toString() {
		return "Aresta "+ this.v1.toString() + " " + this.v2.toString();
	}
}
