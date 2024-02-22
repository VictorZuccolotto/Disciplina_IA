package Busca;

import java.util.ArrayList;
import java.util.List;

import Grafo.Aresta;
import Grafo.No;

public class BuscaProfundidade {

	No noInicial;
	String noFinal;
	public List<No> caminho = new ArrayList<No>();
	
	public BuscaProfundidade(No noInicial, String noFinal) {
		this.noInicial = noInicial;
		this.noFinal = noFinal;
		percorre(null,this.noInicial);
	}

	public boolean percorre(No pai, No atual) {
		if (atual.getNome() == this.noFinal) { //Se o atual é o destino retorna true
			System.out.println("Voce chegou ao seu destino");
			caminho.add(atual);
			return true;
		}
		for (Aresta aresta : atual.getArestas()) {//Percorre cada aresta do nó. A primeira é a da esquerda
			No novoNo = caminhaAresta(aresta, atual);//Caminha essa aresta e chega ao destino
			System.out.println(atual + " -> " + novoNo);
			if (novoNo != pai) {//Se o novono não é de onde ele veio(pai)
				if (percorre(atual, novoNo)) {//percorre com atual sendo pai e o novo sendo atual
					caminho.add(atual);
					return true;
				}
			} else {				//lista       //indice    //tamanho da lista -1
				if (aresta == atual.getArestas().get(atual.getArestas().size() - 1)) { // Se é a ultima aresta do No
					return false;
				}
			}

		}
		return false;
	}

	public No caminhaAresta(Aresta aresta, No noAtual) {
		if (aresta.getV1().equals(noAtual)) {//Se v1 é o no atual retorna v2, se nao retorna v1
			return aresta.getV2();
		}
		return aresta.getV1();
	}

}
