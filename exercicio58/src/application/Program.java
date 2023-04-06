package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, soma, numerosPares = 0;
		double media;
		
		System.out.print("Quantos elementos vai ter o vetor?");
		n = sc.nextInt();		
		int[] vetor = new int[n];
		
		for(int i=0; i<n ; i++) {
			System.out.print("Digite um numero:");
			vetor[i] = sc.nextInt();			
		}
		
		soma =0;		
		for(int i=0; i<n ; i++) {
			if (vetor[i] % 2 == 0) {
				soma = soma + vetor[i];
				numerosPares++;
			} 
		}
		
		
		if(numerosPares == 0) {
			
			System.out.println("Nenhum número par.");
			
		} else {
			
			media = (double)soma / numerosPares;
			System.out.print("Média dos pares: ");
			System.out.printf("%.1f " , media);
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
