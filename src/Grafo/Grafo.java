package Grafo;

import java.util.Arrays;
import java.util.List;

public class Grafo {
	
	List<No> nos = criarGrafo();
	
	
	public List<No> criarGrafo() {
		No arad = new No("Arad");
		No timisoara = new No("Timisoara");
		No zerind = new No("Zerind");
		No oradea = new No("Oradea");
		No sibiu = new No("Sibiu");
		No lugoj = new No("lugoj");
		No mehadia = new No("Mehadia");
		No dobreta = new No("Dobreta");
		No craiova = new No("Craiova");
		No rimnicu_vilcea = new No("Rimnicu Vilcea");
		No fagaras = new No("Fagaras");
		No pitesti = new No("Pitesti");
		No bucharest = new No("Bucharest");
		No giurgiu = new No("Giurgiu");
		No urziceni = new No("Urziceni");
		No hirsova = new No("Hirsova");
		No eforie = new No("Eforie");
		No vaslui = new No("Vaslui");
		No iasi = new No("Iasi");
		No neamt = new No("Neamt");
		
		Aresta at = new Aresta(118, arad, timisoara);
		Aresta as = new Aresta(140, arad,sibiu);
		Aresta az = new Aresta(75, arad,zerind);
		
		Aresta zo = new Aresta(71, zerind,oradea);
		
		Aresta tl = new Aresta(111, timisoara,lugoj);
		
		Aresta os = new Aresta(151, oradea,sibiu);
		
		Aresta sr = new Aresta(80, sibiu,rimnicu_vilcea);
		Aresta sf = new Aresta(99, sibiu,fagaras);

		Aresta lm = new Aresta(70, lugoj,mehadia);
		
		Aresta md = new Aresta(75, mehadia,dobreta);
		
		Aresta dc = new Aresta(120, dobreta,craiova);
		
		Aresta cp = new Aresta(138, craiova,pitesti);
		Aresta cr = new Aresta(146, craiova,rimnicu_vilcea);
		
		
		Aresta rp = new Aresta(97, rimnicu_vilcea,pitesti);
		
		Aresta fb = new Aresta(211, fagaras,bucharest);
		
		Aresta pb = new Aresta(101, pitesti,bucharest);
		
		Aresta bg = new Aresta(90, bucharest,giurgiu);
		Aresta bu = new Aresta(85, bucharest,urziceni);
		
		
		Aresta uh = new Aresta(98, urziceni,hirsova);
		Aresta uv = new Aresta(142, urziceni,vaslui);
		
		Aresta he = new Aresta(86, hirsova,eforie);
		
		
		Aresta vi = new Aresta(92, vaslui,iasi);
		
		Aresta in = new Aresta(87, iasi,neamt);
		
		
		arad.setArestas(Arrays.asList(at,as,az));
		zerind.setArestas(Arrays.asList(zo,az));
		timisoara.setArestas(Arrays.asList(tl,at));
		oradea.setArestas(Arrays.asList(os,zo));
		sibiu.setArestas(Arrays.asList(sr,sf,as,os));
		lugoj.setArestas(Arrays.asList(lm,tl));
		mehadia.setArestas(Arrays.asList(md,lm));
		dobreta.setArestas(Arrays.asList(dc,md));
		craiova.setArestas(Arrays.asList(cp,cr,dc));
		rimnicu_vilcea.setArestas(Arrays.asList(rp,cp,sr));
		fagaras.setArestas(Arrays.asList(fb,sf));
		pitesti.setArestas(Arrays.asList(pb,rp,cp));
		bucharest.setArestas(Arrays.asList(bg,bu,pb,fb));
		giurgiu.setArestas(Arrays.asList(bg));
		urziceni.setArestas(Arrays.asList(uh,uv,bu));
		hirsova.setArestas(Arrays.asList(he,uh));
		eforie.setArestas(Arrays.asList(he));
		vaslui.setArestas(Arrays.asList(vi,uv));
		iasi.setArestas(Arrays.asList(in,vi));
		neamt.setArestas(Arrays.asList(in));
		
		return Arrays.asList(arad, timisoara, zerind, oradea, sibiu, lugoj, mehadia, dobreta, craiova, rimnicu_vilcea, fagaras, pitesti, bucharest, giurgiu, urziceni, hirsova, eforie, vaslui, iasi, neamt);
		
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
