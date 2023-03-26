package exercicio27;

import java.util.Locale;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		for (int i = 0 ; i <= number ; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			double division = n1 / n2;
			
			if(n2 == 0) {
				System.out.print("Division impossible.");
				
			} else {
				System.out.println(division);
			}
						
		}

		
		sc.close();
	}

}
