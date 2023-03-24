package exercicio12;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double value;
		System.out.print("Enter a value between 0 and 100:");
		value = sc.nextDouble();
		
		if ( value >= 0 && value <= 25 ) {
			System.out.print("Intervalo (0,25)");
			
		} else if (value >= 25 && value <= 50 ) {
			System.out.print("Intervalo (25,50)");
			
		} else if (value >= 50 && value <= 75) {
			System.out.print("Intervalo (50,75");
			
		} else if (value >= 75 && value <= 100 ) {
			System.out.print("Intervalo (75,100)");
			
		} else {
			System.out.print("Error");
			
		}

		
		
		sc.close();
	}

}
