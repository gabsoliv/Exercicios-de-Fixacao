package exercicio01;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("DIGITE UM NÚMERO: ");
		int x = sc.nextInt();
		System.out.print("DIGITE OUTRO NÚMERO: ");
		int y = sc.nextInt();
		
		int resultado = x + y;
		
		 
		
		System.out.printf("SOMA = %d " , resultado);
		
		sc.close();

	}

}
