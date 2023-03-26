package exercicio24;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.print("Enter a number: ");
		x = sc.nextInt();
		

		for (int i = 0; i <= x; i++ ) {
			if (i % 2 != 0 ) {
				System.out.println(i);				
			}		
		}		
		sc.close();
	}
}
