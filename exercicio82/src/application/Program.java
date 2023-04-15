package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UseProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			
			if(choice == 'c') {
				
				list.add(new Product(name, price));
				
			} else if (choice == 'u') {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UseProduct(name, price, date));		
				
			} else if (choice == 'i') {
				
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				
			}
		
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		
		sc.close();

	}

}
