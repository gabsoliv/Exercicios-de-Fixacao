package exercicio28;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		int fatorial = 1;
		
		for (int i = 1; i <= number ; i++) {
			fatorial = fatorial * i;

			
		}
		
		System.out.printf("Fatorial de %d = %d" , number , fatorial);

		
		sc.close();

	}

}
