package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] primeiroVetor = new int[n];
		int[] segundoVetor = new int[n];
		int[] somaVetor = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i=0; i < n ;i++) {
			primeiroVetor[i] = sc.nextInt();			
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i=0; i < n ;i++) {			
			segundoVetor[i] = sc.nextInt();			
		}
		
		for(int i=0; i < n; i++) {
			somaVetor[i] = primeiroVetor[i] + segundoVetor[i];
					
		}
		
		System.out.print("Vetor resultante: ");
		for(int i=0; i < n; i++) {
			System.out.printf("%d " , somaVetor[i]);
		}

		sc.close();
	}
}
