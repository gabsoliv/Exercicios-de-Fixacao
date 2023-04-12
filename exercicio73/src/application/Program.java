package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-04-10");
		LocalDateTime d05 = LocalDateTime.parse("2023-05-17T07:30:26"); 
		Instant d06 = Instant.parse("2023-05-23T01:30:26Z");
		
		LocalDate pasteWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println("Origin = " + d04);
		System.out.println("pasteWeekLocalDate = " + pasteWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println();
		
		LocalDateTime pasteWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		LocalDateTime originLocalDateTimePlus = d05.plusHours(3);
		LocalDateTime originLocalDateTimeMinus = d05.minusMinutes(33);
		
		System.out.println("Origin = " + d05);
		System.out.println("pasteWeekLocalDateTime = " + pasteWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		System.out.println("originLocalDateTime mais 3h = " + originLocalDateTimePlus);
		System.out.println("originLocalDateTime menos 3h = " + originLocalDateTimeMinus);
		
		Instant pasteWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		System.out.println();
		System.out.println("Origin = " + d06);
		System.out.println("pasteWeekInstant = " + pasteWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		System.out.println();
		Duration t01 = Duration.between(pasteWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("t01 dias = " + t01.toDays());
		System.out.println("t01 hora = " + t01.toHours());
		System.out.println("t01 minutos = " + t01.toMinutes());
		System.out.println("t01 segundos = " + t01.toSeconds());
		System.out.println("t01 milisegundos = " + t01.toMillis());
			
		Duration t02 = Duration.between(pasteWeekLocalDateTime, d05);
		System.out.println();
		System.out.println("t02 dias = " + t02.toDays());
		System.out.println("t02 hora = " + t02.toHours());
		System.out.println("t02 minutos = " + t02.toMinutes());
		System.out.println("t02 segundos = " + t02.toSeconds());
		System.out.println("t02 milisegundos = " + t02.toMillis());
		
		Duration t03 = Duration.between(pasteWeekInstant, d06);
		System.out.println();
		System.out.println("t03 dias = " + t03.toDays());
		System.out.println("t03 hora = " + t03.toHours());
		System.out.println("t03 minutos = " + t03.toMinutes());
		System.out.println("t03 segundos = " + t03.toSeconds());
		System.out.println("t03 milisegundos = " + t03.toMillis());
		
		Duration t04 = Duration.between(d06, pasteWeekInstant);
		System.out.println();
		System.out.println("t04 dias = " + t04.toDays());
		System.out.println("t04 hora = " + t04.toHours());
		System.out.println("t04 minutos = " + t04.toMinutes());
		System.out.println("t04 segundos = " + t04.toSeconds());
		System.out.println("t04 milisegundos = " + t04.toMillis());
	}

}
