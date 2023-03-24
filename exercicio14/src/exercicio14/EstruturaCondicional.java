package exercicio14;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salary;
		System.out.println("Should I pay income tax?");
		System.out.print("How much do you get paid per month?");
		salary = sc.nextDouble();
		
		double impostoDeRenda;
		
		if (salary <= 2000.0) {
			impostoDeRenda = 0.0;
		}
		else if (salary <= 3000.0) {
			impostoDeRenda = (salary - 2000.0) * 0.08;
		}
		else if (salary <= 4500.0) {
			impostoDeRenda = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			impostoDeRenda = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (impostoDeRenda == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", impostoDeRenda);
		}
		
		
		sc.close();

	}

}
