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
        } catch (Exception e) {
        	System.err.println("Voce nao digitou um numero valido");
        } finally {
        	scanner.close();
		}
        
        
		BuscaProfundidade busca = new BuscaProfundidade(noInicial, noDestino);
		busca.percorre(null, grafo.getNos().get(0));
		Collections.reverse(busca.caminho);
		System.out.println(busca.caminho);
	} 
	
	
	
	
	
	


}
