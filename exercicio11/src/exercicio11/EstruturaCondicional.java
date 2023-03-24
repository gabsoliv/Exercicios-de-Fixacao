package exercicio11;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		System.out.println("----------------------------------");
		System.out.println("CÓDIGO	ESPECIFICAÇÃO	PREÇO");
		System.out.println("----------------------------------");
		System.out.println("1	CACHORRO QUENTE	R$ 4,00");
		System.out.println("2	X-SALADA	R$ 4,50");
		System.out.println("3	X-BACON		R$ 5,00");
		System.out.println("4	TORRADA SIMPLES	R$ 2,00");
		System.out.println("5	REFRIGERANTE	R$ 1,50");
		System.out.println("----------------------------------");
		
		int code;
		int quantity;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the product code: ");
		code = sc.nextInt();
		System.out.print("Enter the quantity of the product: ");
		quantity = sc.nextInt();
		
		double hotDog = 4.00 * quantity;
		double xSalada = 4.50 * quantity;
		double xBacon = 5.00 * quantity;
		double torradaSimples = 2.00 * quantity;
		double refrigerante = 1.50 * quantity;
		
		if (code == 1) {
			System.out.printf("Total payable: R$ %.2f%n" , hotDog );
			
		} else if (code == 2 ) {
			System.out.printf("Total payable: R$ %.2f%n" , xSalada );
			
		} else if (code == 3 ) {
			System.out.printf("Total payable: R$ %.2f%n" , xBacon );
		} else if (code == 4 ) {
			System.out.printf("Total payable: R$ %.2f%n" , torradaSimples );
		} else if (code == 5 ) {
			System.out.printf("Total payable: R$ %.2f%n" , refrigerante );
		} else {
			System.out.print("Erro");
		}
		
		
		
		
		sc.close();
	}

}
