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
	        	throw new Exception();//Se menor que zero ou maior que o nmr de nós no grafo, joga excessão
	        }
	        BuscaProfundidade busca = new BuscaProfundidade(noInicial, noDestino);
	        Collections.reverse(busca.caminho);
	        System.out.println(busca.caminho);
        } catch (Exception e) {
        	System.err.println("Você não digitou um número válido");
        } finally {
        	scanner.close();
		}
	} 
	
	
	
	
	
	


}
