package Grafo;

import java.util.Arrays;
import java.util.Iterator;
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
		
		Aresta a1 = new Aresta(118, Arrays.asList(arad,timisoara));
		Aresta a2 = new Aresta(140, Arrays.asList(arad,sibiu));
		Aresta a3 = new Aresta(75, Arrays.asList(arad,zerind));
		
		Aresta z1 = new Aresta(75, Arrays.asList(zerind,arad));//
		Aresta z2 = new Aresta(71, Arrays.asList(zerind,oradea));
		
		Aresta t1 = new Aresta(111, Arrays.asList(timisoara,lugoj));
		Aresta t2 = new Aresta(118, Arrays.asList(timisoara,arad));//
		
		Aresta o1 = new Aresta(71, Arrays.asList(oradea,zerind));//
		Aresta o2 = new Aresta(151, Arrays.asList(oradea,sibiu));
		
		Aresta s1 = new Aresta(80, Arrays.asList(sibiu,rimnicu_vilcea));
		Aresta s2 = new Aresta(140, Arrays.asList(sibiu,arad));//
		Aresta s3 = new Aresta(151, Arrays.asList(sibiu,oradea));//
		Aresta s4 = new Aresta(99, Arrays.asList(sibiu,fagaras));

		Aresta l1 = new Aresta(70, Arrays.asList(lugoj,mehadia));
		Aresta l2 = new Aresta(111, Arrays.asList(lugoj,timisoara));//
		
		Aresta m1 = new Aresta(75, Arrays.asList(mehadia,dobreta));
		Aresta m2 = new Aresta(70, Arrays.asList(mehadia,lugoj));//
		
		Aresta d1 = new Aresta(120, Arrays.asList(dobreta,craiova));
		Aresta d2 = new Aresta(75, Arrays.asList(dobreta,mehadia));//
		
		Aresta c1 = new Aresta(138, Arrays.asList(craiova,pitesti));
		Aresta c2 = new Aresta(146, Arrays.asList(craiova,rimnicu_vilcea));
		Aresta c3 = new Aresta(120, Arrays.asList(craiova,dobreta));//
		
		
		Aresta r1 = new Aresta(146, Arrays.asList(rimnicu_vilcea,craiova));//
		Aresta r2 = new Aresta(97, Arrays.asList(rimnicu_vilcea,pitesti));
		Aresta r3 = new Aresta(80, Arrays.asList(rimnicu_vilcea,sibiu));//
		
		Aresta f1 = new Aresta(211, Arrays.asList(fagaras,bucharest));
		Aresta f2 = new Aresta(99, Arrays.asList(fagaras,sibiu));//
		
		Aresta p1 = new Aresta(101, Arrays.asList(pitesti,bucharest));
		Aresta p2 = new Aresta(97, Arrays.asList(pitesti,rimnicu_vilcea));//
		Aresta p3 = new Aresta(138, Arrays.asList(pitesti,craiova));//
		
		Aresta b1 = new Aresta(90, Arrays.asList(bucharest,giurgiu));
		Aresta b2 = new Aresta(85, Arrays.asList(bucharest,urziceni));
		Aresta b3 = new Aresta(101, Arrays.asList(bucharest,pitesti));//
		Aresta b4 = new Aresta(211, Arrays.asList(bucharest,fagaras));//
		
		Aresta g1 = new Aresta(90, Arrays.asList(giurgiu,bucharest));//
		
		Aresta u1 = new Aresta(98, Arrays.asList(urziceni,hirsova));
		Aresta u2 = new Aresta(142, Arrays.asList(urziceni,vaslui));
		Aresta u3 = new Aresta(85, Arrays.asList(urziceni,bucharest));//
		
		Aresta h1 = new Aresta(86, Arrays.asList(hirsova,eforie));
		Aresta h2 = new Aresta(98, Arrays.asList(hirsova,urziceni));//
		
		Aresta e1 = new Aresta(86, Arrays.asList(eforie,hirsova));//
		
		Aresta v1 = new Aresta(92, Arrays.asList(vaslui,iasi));
		Aresta v2 = new Aresta(142, Arrays.asList(vaslui,urziceni));//
		
		Aresta i1 = new Aresta(87, Arrays.asList(iasi,neamt));
		Aresta i2 = new Aresta(92, Arrays.asList(iasi,vaslui));//
		
		Aresta n1 = new Aresta(87, Arrays.asList(neamt,iasi));//
		
		arad.setArestas(Arrays.asList(a1,a2,a3));
		zerind.setArestas(Arrays.asList(z1,z2));
		timisoara.setArestas(Arrays.asList(t1,t2));
		oradea.setArestas(Arrays.asList(o1,o2));
		sibiu.setArestas(Arrays.asList(s1,s2,s3,s4));
		lugoj.setArestas(Arrays.asList(l1,l2));
		mehadia.setArestas(Arrays.asList(m1,m2));
		dobreta.setArestas(Arrays.asList(d1,d2));
		craiova.setArestas(Arrays.asList(c1,c2,c3));
		rimnicu_vilcea.setArestas(Arrays.asList(r1,r2,r3));
		fagaras.setArestas(Arrays.asList(f1,f2));
		pitesti.setArestas(Arrays.asList(p1,p2,p3));
		bucharest.setArestas(Arrays.asList(b1,b2,b3,b4));
		giurgiu.setArestas(Arrays.asList(g1));
		urziceni.setArestas(Arrays.asList(u1,u2,u3));
		hirsova.setArestas(Arrays.asList(h1,h2));
		eforie.setArestas(Arrays.asList(e1));
		vaslui.setArestas(Arrays.asList(v1,v2));
		iasi.setArestas(Arrays.asList(i1,i2));
		neamt.setArestas(Arrays.asList(n1));
		
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
