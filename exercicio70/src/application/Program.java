package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); // data
		LocalDateTime d02 = LocalDateTime.now(); // data e hora LOCAL
		Instant d03 = Instant.now(); // data e hora padrão gmt londres
		
		LocalDate d04 = LocalDate.parse("2023-04-10"); // imprime a data que vc inserir
		LocalDateTime d05 = LocalDateTime.parse("2023-05-10T07:30:26"); // imprime a data e hora que vc inserir 
		Instant d06 = Instant.parse("2023-05-10T07:30:26Z");
		Instant d07 = Instant.parse("2023-05-10T07:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("10/04/2023" , fmt01); // posso passar no formato customizado, mas é impresso no padrão ISO
		LocalDateTime d09 = LocalDateTime.parse("10/04/2023 07:30" , fmt02);
		
		LocalDate d10 = LocalDate.of(2023, 04, 10);
		LocalDateTime d11 = LocalDateTime.of(2023, 04, 10, 07, 03);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}
}
