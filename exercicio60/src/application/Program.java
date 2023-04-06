package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int n;
		double media;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados?");
		n = sc.nextInt();
		
		String[] names = new String[n];
		double[] primeiraNota = new double[n];
		double[] segundaNota = new double[n];
		
		for (int i=0; i<n ; i++) {
			System.out.println("Dados do " + (i+1) + "o aluno > ");
			sc.nextLine();
			System.out.print("Nome: ");
			names[i] = sc.nextLine();
			System.out.print("Primeira Nota: ");
			primeiraNota[i] = sc.nextDouble();
			System.out.print("Segunda Nota: ");
			segundaNota[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");		
		for(int i=0; i<n ; i++) {
			media = (primeiraNota[i] + segundaNota[i]) / 2;		
			
			if(media >= 6.0) {
				System.out.println(names[i]);
			}
		}
		
		
		
		
		sc.close();

	}

}
