package exercicio29;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		
		
		for (int i = 1 ; i <= number ; i++) {
			
			if (number % i == 0) {
				System.out.println(i);
				
			}
			
		}

		sc.close();

	}

}
