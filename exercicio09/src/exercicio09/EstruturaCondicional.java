package exercicio09;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number01;
		int number02;
		System.out.print("Enter a number: ");
		number01 = sc.nextInt();
		System.out.print("Enter a number: ");
		number02 = sc.nextInt();
		
		if (number01 % number02 == 0 || number02 % number01 == 0) {
			System.out.println("Are multiple");
		}
		else {
			System.out.println("Are not multiple");
		}
		
		
		
		
		
		
		sc.close();
	}

}
