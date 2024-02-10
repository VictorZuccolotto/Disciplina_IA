package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Busca.BuscaProfundidade;
import Grafo.Aresta;
import Grafo.Grafo;
import Grafo.No;

public class Main {
	
	public static String noFinal = "Rimnicu Vilcea";
	
	
	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		System.out.println("Escolha o nó inicial:");
		System.out.println(grafo);
		
        Scanner scanner = new Scanner(System.in);
        No noInicial = null;
        String noDestino;
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
        
		BuscaProfundidade busca = new BuscaProfundidade(noInicial, "Dobreta");
		busca.percorre(null, grafo.getNos().get(0));
		Collections.reverse(busca.caminho);
		System.out.println(busca.caminho);
	} 
	
	
	
	
	
	


}
