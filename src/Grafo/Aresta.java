package Grafo;

public class Aresta {
	
	
	int valor;
<<<<<<< HEAD
=======
//	List<No> nos;
>>>>>>> b3b51a17c046da51c34bf8eb87428e9aed173e59
	
	private No v1;
	private No v2;

	
	public Aresta(int valor, No v1, No v2) {
		this.valor = valor;
<<<<<<< HEAD
		this.v1 = v1;
		this.v2 = v2;
=======
		this.v1 = nos.get(0);
		this.v2 = nos.get(1);
//		this.nos = nos;
>>>>>>> b3b51a17c046da51c34bf8eb87428e9aed173e59
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

<<<<<<< HEAD
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
=======

//	public List<No> getNos() {
//		return nos;
//	}
//
//
//	public void setNos(List<No> nos) {
//		this.nos = nos;
//	}
	
	
	
>>>>>>> b3b51a17c046da51c34bf8eb87428e9aed173e59
	
	@Override
	public String toString() {
		return "Aresta "+ this.v1.toString() + " " + this.v2.toString();
<<<<<<< HEAD
=======
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
>>>>>>> b3b51a17c046da51c34bf8eb87428e9aed173e59
	}
}
