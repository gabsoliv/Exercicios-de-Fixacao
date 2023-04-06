package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, qtdpares;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i + 1) + "o número: ");
			vetor[i] = sc.nextInt();
		}

		System.out.print("Números pares = ");
		qtdpares = 0;
	    for (int i=0; i<n; i++) {
	        if (vetor[i] % 2 == 0) {
	        	System.out.printf("%d  ", vetor[i]);
	            qtdpares++;
	        }
	    }
		
		System.out.println();
		System.out.print("QUANTIDADE DE PARES = " + qtdpares);
		
		


		sc.close();
	}
}
