package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int n;
		double media, soma;
		System.out.print("Quantos números irá digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		for (int i=0; i < n ; i++) {
			System.out.print("Enter a number: ");
			vetor[i] = sc.nextDouble();
			
		}
		
		System.out.print("VALORES DIGITADOS = ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f " , vetor[i]);
		}
		System.out.println();
		
		
		soma = 0;
		for (int i=0; i < vetor.length ; i++) {
			soma += vetor[i];
		}
		System.out.printf("SOMA: %.2f%n" , soma);
		media = soma / vetor.length;
		System.out.printf("MÉDIA: %.2f%n" , media);

		sc.close();

	}
}
