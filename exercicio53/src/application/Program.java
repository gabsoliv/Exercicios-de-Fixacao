package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Quantas pessoas irão digitar? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] altura = new double[n];
		int[] idades = new int[n];

		for (int i = 0; i < n; i++) {			
			System.out.println("Dados da " + (i + 1) + "a pessoa >  ");
			System.out.print("Nome:");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();

		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + altura[i];			
		}
		
		double mediaAlt = soma / n;
		System.out.println();
		System.out.printf("Altura média: %.2f%n" , mediaAlt);
		
		int contagem = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				contagem = contagem + 1;
			}
		}
		
		double porcentagem = contagem * 100.0 / n;		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , porcentagem);
		
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
			
			
			
		}
		sc.close();
	}

}
