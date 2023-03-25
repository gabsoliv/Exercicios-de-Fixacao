package exercicio17;

import java.util.Scanner;

public class CondicaoTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double value;
		System.out.println("How much will the discount be?");
		System.out.print("Enter the value of your product: ");
		value = sc.nextDouble();
		
		double desconto = (value < 20.0) ? value * 0.1 : value * 0.05;
		System.out.printf("Discount applied from %.2f " , desconto);
		
		sc.close();

	}

}
