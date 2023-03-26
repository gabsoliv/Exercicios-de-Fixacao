package exercicio22;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number:");
		number = sc.nextInt();
		int soma = 0;
		
		for (int i = 0 ; i < number ; i++) {
			System.out.print("Enter a number:");
			int x = sc.nextInt();
			soma += x;	
						
			
		}
		
		
		System.out.println(soma);
		sc.close();

	}

}
