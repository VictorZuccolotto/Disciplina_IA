package main;

import java.util.Collections;
import java.util.Scanner;

import Busca.BuscaProfundidade;
import Grafo.Grafo;
import Grafo.No;

public class Main {
	
	
	
	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		System.out.println("Escolha o nó inicial:");
		System.out.println(grafo);
		
        Scanner scanner = new Scanner(System.in);
        No noInicial = null;
        String noDestino = null;
        try {
			
	        int numero = scanner.nextInt();
	        noInicial = grafo.getNos().get(numero);
	        System.out.println("Escolha o destino: ");
	        int destino = scanner.nextInt();
	        noDestino = grafo.getNos().get(destino).getNome();
	        if(destino > grafo.getNos().size()-1 || destino < 0 || numero > grafo.getNos().size()-1 || numero < 0) {
	        	throw new Exception();
	        }
	        BuscaProfundidade busca = new BuscaProfundidade(noInicial, noDestino);
	        Collections.reverse(busca.caminho);
	        System.out.println(busca.caminho);
        } catch (Exception e) {
        	System.err.println("Voce nao digitou um numero valido");
        } finally {
        	scanner.close();
		}
        
        
<<<<<<< HEAD
=======
		BuscaProfundidade busca = new BuscaProfundidade(noInicial, noDestino);
		busca.percorre(null, grafo.getNos().get(0));
		Collections.reverse(busca.caminho);
		System.out.println(busca.caminho);
>>>>>>> b3b51a17c046da51c34bf8eb87428e9aed173e59
	} 
	
	
	
	
	
	


}
