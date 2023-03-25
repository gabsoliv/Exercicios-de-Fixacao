package exercicio21;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("We want to know your preference.");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - FIM");
		System.out.print("Choose a number: ");
		choice = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		if (choice == 4 || choice >= 5) {
			System.out.print("Thank you very much!");
		}
		
		
		while (choice != 0) {
			
			if(choice == 1) {
				alcool += 1;
				System.out.printf("%nThank you very much!%n");
				System.out.printf("Álcool = %d%n" , alcool);
				System.out.printf("Gasolina = %d%n " , gasolina);
				System.out.printf("Diesel = %d%n%n  " , diesel);
				
				System.out.println("We want to know your preference.");
				System.out.println("1 - Álcool");
				System.out.println("2 - Gasolina");
				System.out.println("3 - Diesel");
				System.out.println("4 - FIM");
				System.out.print("Choose a number: ");
				choice = sc.nextInt();
				
			} else if (choice == 2) {
				gasolina += 1;
				System.out.printf("%nThank you very much!%n");
				System.out.printf("Álcool = %d%n" , alcool);
				System.out.printf("Gasolina = %d%n " , gasolina);
				System.out.printf("Diesel = %d%n%n  " , diesel);
				
				System.out.println("We want to know your preference.");
				System.out.println("1 - Álcool");
				System.out.println("2 - Gasolina");
				System.out.println("3 - Diesel");
				System.out.println("4 - FIM");
				System.out.print("Choose a number: ");
				choice = sc.nextInt();
				
			} else if (choice == 3) {
				diesel += 1;
				System.out.printf("%nThank you very much!%n");
				System.out.printf("Álcool = %d%n" , alcool);
				System.out.printf("Gasolina = %d%n " , gasolina);
				System.out.printf("Diesel = %d%n%n  " , diesel);
				
				System.out.println("We want to know your preference.");
				System.out.println("1 - Álcool");
				System.out.println("2 - Gasolina");
				System.out.println("3 - Diesel");
				System.out.println("4 - FIM");
				System.out.print("Choose a number: ");
				choice = sc.nextInt();
				
			} 
			
				
			
		}
		
		
		
		sc.close();

	}

}
