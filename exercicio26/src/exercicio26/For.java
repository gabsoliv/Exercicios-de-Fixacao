package exercicio26;

import java.util.Locale;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		for (int i =0 ; i < number ; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
			System.out.printf( "%.1f" , media);
			
		}

		sc.close();
	}

}
