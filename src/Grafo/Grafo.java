package Grafo;

import java.util.Arrays;
import java.util.List;

public class Grafo {
	
	List<No> nos = criarGrafo();
	
	
	public List<No> criarGrafo() {
		No arad = new No("Arad");
		No bucharest = new No("Bucharest");
		No craiova = new No("Craiova");
		No dobreta = new No("Dobreta");
		No eforie = new No("Eforie");
		No fagaras = new No("Fagaras");
		No giurgiu = new No("Giurgiu");
		No hirsova = new No("Hirsova");
		No iasi = new No("Iasi");
		No lugoj = new No("lugoj");
		No mehadia = new No("Mehadia");
		No neamt = new No("Neamt");
		No oradea = new No("Oradea");
		No pitesti = new No("Pitesti");
		No rimnicu_vilcea = new No("Rimnicu Vilcea");
		No sibiu = new No("Sibiu");
		No timisoara = new No("Timisoara");
		No urziceni = new No("Urziceni");
		No vaslui = new No("Vaslui");
		No zerind = new No("Zerind");
		

		Aresta ab = new Aresta(1, arad, bucharest);
		Aresta ac = new Aresta(1, arad, craiova);

		Aresta bd = new Aresta(2, bucharest, dobreta);
		Aresta be = new Aresta(2, bucharest, eforie);
		
		Aresta cf = new Aresta(2, craiova, fagaras);
		Aresta cg = new Aresta(2, craiova, giurgiu);

		Aresta dh = new Aresta(3, dobreta, hirsova);
		Aresta di = new Aresta(3, dobreta, iasi);

		Aresta el = new Aresta(3, eforie, lugoj);
		Aresta em = new Aresta(3, eforie, mehadia);
		
		Aresta fn = new Aresta(3, fagaras, neamt);
		Aresta fo = new Aresta(3, fagaras, oradea);

		Aresta gp = new Aresta(3, giurgiu, pitesti);
		Aresta gr = new Aresta(3, giurgiu, rimnicu_vilcea);

		Aresta hs = new Aresta(4, hirsova, sibiu);
		Aresta ht = new Aresta(4, hirsova, timisoara);

		Aresta iu = new Aresta(4, iasi, urziceni);
		Aresta iv = new Aresta(4, iasi, vaslui);

		Aresta lz = new Aresta(4, lugoj, zerind);
	
		
		arad.setArestas(Arrays.asList(ab, ac));
		bucharest.setArestas(Arrays.asList(ab, bd, be));
		craiova.setArestas(Arrays.asList(ac, cf, cg));
		dobreta.setArestas(Arrays.asList(bd, dh, di));

		eforie.setArestas(Arrays.asList(be, el, em));
		fagaras.setArestas(Arrays.asList(cf, fn, fo));
		giurgiu.setArestas(Arrays.asList(cg, gp, gr));
		hirsova.setArestas(Arrays.asList(dh, hs, ht));

		iasi.setArestas(Arrays.asList(di, iu, iv));
		lugoj.setArestas(Arrays.asList(el, lz));
		mehadia.setArestas(Arrays.asList(em));
		neamt.setArestas(Arrays.asList(fn));

		oradea.setArestas(Arrays.asList(fo));
		pitesti.setArestas(Arrays.asList(gp));
		rimnicu_vilcea.setArestas(Arrays.asList(gr));
		sibiu.setArestas(Arrays.asList(hs));

		timisoara.setArestas(Arrays.asList(ht));
		urziceni.setArestas(Arrays.asList(iu));
		vaslui.setArestas(Arrays.asList(iv));
		zerind.setArestas(Arrays.asList(lz));
		
		return Arrays.asList(arad, timisoara, zerind, sibiu, lugoj, mehadia, dobreta, craiova, rimnicu_vilcea, fagaras, pitesti, bucharest, giurgiu, urziceni, hirsova, eforie, vaslui, iasi, neamt);
		
	}
	
	
	public List<No> getNos() {
		return nos;
	}


	public void setNos(List<No> nos) {
		this.nos = nos;
	}


	@Override
	public String toString() {
		String retorno = "";
		for (int i = 0; i < nos.size(); i++) {
			retorno += "["+i+"] "+ this.nos.get(i)+"    ";
			if((i+1)%4 == 0) {
				retorno += "\n\n";
			}
		}
		return retorno;
	}
}
