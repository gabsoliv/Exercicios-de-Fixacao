package exercicio04;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("What is your registration number: ");
		int registration = sc.nextInt();
		
		System.out.print("Enter the number of hours worked in the month: ");
		double hours = sc.nextDouble();
		
		System.out.print("Enter the amount you receive per hour: ");
		double amount = sc.nextDouble();
		
		double salary = hours * amount;
		System.out.printf("NUMBER: %d%n", registration);
		System.out.printf("SALARY: U$ %.2f", salary);
		
		
		sc.close();

	}

}
