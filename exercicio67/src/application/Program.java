package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Informations;

public class Program {

	public static void main(String[] args) {
		List<Informations> inform = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos pets você tem? ");
		int n = sc.nextInt();		
		
		for(int i = 0; i<n ; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Personalidade: ");
			String proff = sc.next();

			inform.add(new Informations(name, idade, proff));			
			
		}
		
		System.out.println();
		System.out.println("Resumo das informações:");
		for(Informations obj: inform) {
			System.out.println(obj);			
		}
				
		sc.close();
	}
}
