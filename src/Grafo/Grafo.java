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
		
		Aresta at = new Aresta(118, Arrays.asList(arad,timisoara));
		Aresta as = new Aresta(140, Arrays.asList(arad,sibiu));
		Aresta az = new Aresta(75, Arrays.asList(arad,zerind));
		
//		Aresta z1 = new Aresta(75, Arrays.asList(zerind,arad));//
		Aresta zo = new Aresta(71, Arrays.asList(zerind,oradea));
		
		Aresta tl = new Aresta(111, Arrays.asList(timisoara,lugoj));
//		Aresta t2 = new Aresta(118, Arrays.asList(timisoara,arad));//
		
//		Aresta o1 = new Aresta(71, Arrays.asList(oradea,zerind));//
		Aresta os = new Aresta(151, Arrays.asList(oradea,sibiu));
		
		Aresta sr = new Aresta(80, Arrays.asList(sibiu,rimnicu_vilcea));
//		Aresta s2 = new Aresta(140, Arrays.asList(sibiu,arad));//
//		Aresta s3 = new Aresta(151, Arrays.asList(sibiu,oradea));//
		Aresta sf = new Aresta(99, Arrays.asList(sibiu,fagaras));

		Aresta lm = new Aresta(70, Arrays.asList(lugoj,mehadia));
//		Aresta l2 = new Aresta(111, Arrays.asList(lugoj,timisoara));//
		
		Aresta md = new Aresta(75, Arrays.asList(mehadia,dobreta));
//		Aresta m2 = new Aresta(70, Arrays.asList(mehadia,lugoj));//
		
		Aresta dc = new Aresta(120, Arrays.asList(dobreta,craiova));
//		Aresta d2 = new Aresta(75, Arrays.asList(dobreta,mehadia));//
		
		Aresta cp = new Aresta(138, Arrays.asList(craiova,pitesti));
		Aresta cr = new Aresta(146, Arrays.asList(craiova,rimnicu_vilcea));
//		Aresta c3 = new Aresta(120, Arrays.asList(craiova,dobreta));//
		
		
//		Aresta r1 = new Aresta(146, Arrays.asList(rimnicu_vilcea,craiova));//
		Aresta rp = new Aresta(97, Arrays.asList(rimnicu_vilcea,pitesti));
//		Aresta r3 = new Aresta(80, Arrays.asList(rimnicu_vilcea,sibiu));//
		
		Aresta fb = new Aresta(211, Arrays.asList(fagaras,bucharest));
//		Aresta f2 = new Aresta(99, Arrays.asList(fagaras,sibiu));//
		
		Aresta pb = new Aresta(101, Arrays.asList(pitesti,bucharest));
//		Aresta p2 = new Aresta(97, Arrays.asList(pitesti,rimnicu_vilcea));//
//		Aresta p3 = new Aresta(138, Arrays.asList(pitesti,craiova));//
		
		Aresta bg = new Aresta(90, Arrays.asList(bucharest,giurgiu));
		Aresta bu = new Aresta(85, Arrays.asList(bucharest,urziceni));
//		Aresta b3 = new Aresta(101, Arrays.asList(bucharest,pitesti));//
//		Aresta b4 = new Aresta(211, Arrays.asList(bucharest,fagaras));//
		
//		Aresta g1 = new Aresta(90, Arrays.asList(giurgiu,bucharest));//
		
		Aresta uh = new Aresta(98, Arrays.asList(urziceni,hirsova));
		Aresta uv = new Aresta(142, Arrays.asList(urziceni,vaslui));
//		Aresta u3 = new Aresta(85, Arrays.asList(urziceni,bucharest));//
		
		Aresta he = new Aresta(86, Arrays.asList(hirsova,eforie));
//		Aresta h2 = new Aresta(98, Arrays.asList(hirsova,urziceni));//
		
//		Aresta eh = new Aresta(86, Arrays.asList(eforie,hirsova));//
		
		Aresta vi = new Aresta(92, Arrays.asList(vaslui,iasi));
//		Aresta v2 = new Aresta(142, Arrays.asList(vaslui,urziceni));//
		
		Aresta in = new Aresta(87, Arrays.asList(iasi,neamt));
//		Aresta i2 = new Aresta(92, Arrays.asList(iasi,vaslui));//
		
//		Aresta n1 = new Aresta(87, Arrays.asList(neamt,iasi));//
		
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
