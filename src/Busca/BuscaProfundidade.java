package Busca;

import java.util.ArrayList;
import java.util.List;

import Grafo.Aresta;
import Grafo.No;
import main.Main;

public class BuscaProfundidade {

	No noInicial;
	String noFinal;
	public List<No> caminho = new ArrayList<No>();
	
	public BuscaProfundidade(No noInicial, String noFinal) {
		this.noInicial = noInicial;
		this.noFinal = noFinal;
	}
	
	public boolean percorre(No pai, No atual) {
		if(atual.getNome() == Main.noFinal) {
			System.out.println("Voce chegou ao seu destino");
			caminho.add(atual);
			return true;
		}
		for (Aresta aresta : atual.getArestas()) {
			if(aresta.getNos().get(1) != pai) {
//				System.out.println(aresta.getNos().get(1));
				System.out.println(aresta.toString());
				if(percorre(atual, aresta.getNos().get(1))) {
					caminho.add(atual);
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}

	
}
