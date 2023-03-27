package exercicio30;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
			
			
		}

		sc.close();

	}

}
