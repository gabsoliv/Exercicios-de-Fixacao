package exercicio31;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);			
		
		char resp = 's';

		do {
			
			double temperatura;
			System.out.printf("Digite a temperatura em Celsius: ");
			temperatura = sc.nextDouble();
			double fahrenheit = 9.00 * temperatura / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n" , fahrenheit);
			System.out.print("Deseja repetir? (s/n) ");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');

		sc.close();

	}

}
