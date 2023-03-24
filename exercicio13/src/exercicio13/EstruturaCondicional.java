package exercicio13;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double firstX;
		double secondY;
		System.out.println("Enter two value with one decimal place");
		System.out.print("First value:");
		firstX = sc.nextDouble();
		System.out.print("Second value:");
		secondY = sc.nextDouble();
		
		if (firstX == 0 && secondY == 0) {
			System.out.print("Origem");
			
		} else if (firstX >= 0.1  && secondY  >= 0.1) {
			System.out.print("Q1");
			
		} else if (firstX >= 0.1  && secondY <= 0) {
			System.out.print("Q4");
			
		} else if (firstX < 0 && secondY >= 0.1) {
			System.out.print("Q2");
			
		} else if (firstX < 0 && secondY < 0) {
			System.out.print("Q2");
			
		} else {
			System.out.print("Erro");
		}
		
		
		
		
		
		
		sc.close();

	}

}
