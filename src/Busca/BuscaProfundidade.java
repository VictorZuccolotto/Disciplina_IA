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
	}
	
	public boolean percorre(No pai, No atual) {
		if(atual.getNome() == this.noFinal) {
			System.out.println("Voce chegou ao seu destino");
			caminho.add(atual);
			return true;
		}
		for (Aresta aresta : atual.getArestas()) {
			No novoNo = caminhaAresta(aresta,atual);
			System.out.println(atual + " -> " + novoNo);
			if(novoNo != pai) {
				if( percorre(atual,novoNo)) {
					caminho.add(atual);
					return true;
				}
			}else {
				if(aresta == atual.getArestas().get(atual.getArestas().size()-1)){ // Se é a ultima aresta do vertice
					return false;					
				}
			}
			
		}
		return false;
	}

	public No caminhaAresta(Aresta aresta, No noAtual) {
		if(aresta.getV1().equals(noAtual)) {
			return aresta.getV2();
		}
		return aresta.getV1();
	}
	
}
