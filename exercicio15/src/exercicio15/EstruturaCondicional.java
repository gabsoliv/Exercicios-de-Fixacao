package exercicio15;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos;
		double conta = 50.00;
		
		
		System.out.print("How many minutes did you use?");
		minutos = sc.nextInt();
		int ultrapassou = minutos - 100;
		
		if (minutos >= 100 ) {
			conta += conta + (minutos - 100) * 2.00;
			System.out.printf("You have exceeded %d minutes of the allowance." ,  ultrapassou );
			System.out.printf("Total payable is: R$ %.2f " , conta);
			
		} else if (minutos < 100) {
			
			System.out.printf("You have not exceeded the minutes package.");
			System.out.printf("Total payable is: R$ %.2f/" , conta);
			
			
		} else {
			System.out.print("Error");
			
		}
		
		
		
	
		
		
		
		
		
		
		
		sc.close();

	}

}
