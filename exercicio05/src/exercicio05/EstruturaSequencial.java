package exercicio05;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Product code: ");
		int code01 = sc.nextInt();
		System.out.print("Product Quantity: ");
		int quantity01 = sc.nextInt();
		System.out.print("Product unit value: ");
		double unitValue01 = sc.nextDouble();
		
		System.out.print("Product code: ");
		int code02 = sc.nextInt();
		System.out.print("Product Quantity: ");
		int quantity02 = sc.nextInt();
		System.out.print("Product unit value: ");
		double unitValue02 = sc.nextDouble();
		
		
		double amount01 = quantity01 * unitValue01;
		double amount02 = quantity02 * unitValue02;
		double result = amount01 + amount02;
		
		System.out.printf("Total payable for product %d = U$ %.2f%n", code01, amount01);
		System.out.printf("Total payable for product %d = U$ %.2f%n", code02, amount02);
		System.out.printf("Amount payable: U$ %.2f", result);
		
		
		sc.close();
		

	}

}
