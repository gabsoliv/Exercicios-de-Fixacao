package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>( );
		
		list.add("Maria");
		list.add("Alex");
		list.add("Marco");
		list.add("Moana");
		list.add("Ana");
		list.add("Analia");
		list.add("Amora");
		list.add("Analice");
		list.add("Miriam");
		list.add("Pipoca");
		list.add("Aninha");
		list.add("Dave");
		list.add("Leu");
		list.add(2, "Antony"); // adicionando elemento na lista
		
		
		
		System.out.println("Lista original > ");
		System.out.println("-----");
		for (String names: list) {
			System.out.println(names);			
		}
		System.out.println("-----");
		
		list.remove("Alex");  // removendo Alex
		// list.remove(4);		// removendo Ana
		list.removeIf(names -> names.charAt(0) == 'M');	 // removendo qualquer palavra que comece com M
		System.out.println();
		
		System.out.println("Nova lista (sem palavras com M) > ");
		System.out.println("-----");
		for (String names: list) {
			System.out.println(names);			
		}
		System.out.println("-----");
		
		System.out.println();
		System.out.println("Index of Dave: " + list.indexOf("Dave")); // quando encontra, retorna a posição
		System.out.println("Index of Moana: " + list.indexOf("Moana")); // quando não encontrado, retorna -1
		System.out.println("Tamanho da lista: " + list.size()); 	// tamanho da lista
		System.out.println();
		
		List<String> result = list.stream().filter(names -> names.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("Nova lista (APENAS palavras com A) > ");
		System.out.println("-----");
		for (String names: result) {
			System.out.println(names);			
			
		}
		System.out.println("-----");
		System.out.println();
		
		String namess = list.stream().filter(names -> names.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(namess);
		
		
	}

}
