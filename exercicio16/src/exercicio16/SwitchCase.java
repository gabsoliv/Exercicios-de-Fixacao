package exercicio16;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia;
		int number;
		System.out.print("Enter a number from 1 to 8:");
		number = sc.nextInt();
		
		
		
		
		switch (number) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;	
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;	
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Please enter a valid number. ";
			break;
		
		}
		
		System.out.print("Dia da semana: " + dia);
		sc.close();

	}

}
