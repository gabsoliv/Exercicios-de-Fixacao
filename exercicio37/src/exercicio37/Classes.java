package exercicio37;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Classes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products products = new Products();
		
		System.out.println("Enter product data");
		System.out.print("Name: ");
		products.name = sc.nextLine();
		System.out.print("Price: ");
		products.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		products.quantity = sc.nextInt();
		
		System.out.println("Product data: " + products);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		products.addProducts(quantity);
		System.out.println("Updated data:" + products);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		int removeQuantity = sc.nextInt();
		products.removeProducts(removeQuantity);
		System.out.println("Updated data:" + products);
		
		
		
		
		sc.close();
	}

}
