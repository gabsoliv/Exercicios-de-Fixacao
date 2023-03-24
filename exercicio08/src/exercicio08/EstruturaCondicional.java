package exercicio08;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		
		int divisao = number % 2;
		
		if ( divisao == 0 ) {
			System.out.print("PAR");
			
		} else {
			System.out.print("ÍMPAR");
			
		}
		
		sc.close();

	}

}
