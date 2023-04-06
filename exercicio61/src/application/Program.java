package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, numeroDeHomens, numeroDeMulheres;
		double maiorAltura, menorAltura, mediaAlturaMulher, alturaFemTotal;
		System.out.print("Quantas pessoas serao digitadas?");
		n = sc.nextInt();

		double[] altura = new double[n];
		char[] genero = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}

		maiorAltura = altura[0];
		menorAltura = altura[0];
		for (int i = 0; i < n; i++) {

			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}

			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}

		numeroDeHomens = 0;
		numeroDeMulheres = 0;
		alturaFemTotal = 0;

		for (int i = 0; i < n; i++) {
			if (genero[i] == 'M') {
				numeroDeHomens++;

			} else {
				numeroDeMulheres++;
				alturaFemTotal = alturaFemTotal + altura[i];
			}

		}
		mediaAlturaMulher = alturaFemTotal / numeroDeMulheres;

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulher);
		System.out.printf("Numero de homens = %d\n", numeroDeHomens);

		sc.close();
	}
}
