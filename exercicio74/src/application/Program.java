package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat ex01 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat ex02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat ex03 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		ex03.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y00 = new Date();
		Date y01 = new Date(System.currentTimeMillis());
		Date y02 = new Date(0L);
		Date y03 = new Date(1000L * 60L * 60L * 5L);
		
		
		Date x02 = ex01.parse("04/05/2023");
		Date  x03 = ex02.parse("19/04/2023 08:33:26");
		Date x04 = Date.from(Instant.parse("2023-07-17T08:33:26Z"));
		
		
		System.out.println("Imprimindo sem formatação");
		System.out.println("y00 = " + y00);
		System.out.println("y01 = " + y01);
		System.out.println("y02 = " + y02);
		System.out.println("y02 = " + y03);
		System.out.println();
		System.out.println("x02 = " + x02);
		System.out.println("x03 = " + x03);
		System.out.println("x04 = " + x04);
		System.out.println();
		System.out.println("Imprimindo com a hora no formato BR");
		System.out.println("y00 = " + ex02.format(y00));
		System.out.println("y01 = " + ex02.format(y01));
		System.out.println("y02 = " + ex02.format(y02));
		System.out.println("y02 = " + ex02.format(y03));
		System.out.println();
		System.out.println("x02 = " + ex02.format(x02));
		System.out.println("x03 = " + ex02.format(x03));
		System.out.println("x04 = " + ex02.format(x04));
		System.out.println();
		System.out.println("Imprimindo com a hora no formato UTC");
		System.out.println("y00 = " + ex03.format(y00));
		System.out.println("y01 = " + ex03.format(y01));
		System.out.println("y02 = " + ex03.format(y02));
		System.out.println("y02 = " + ex03.format(y03));
		System.out.println();
		System.out.println("x02 = " + ex03.format(x02));
		System.out.println("x03 = " + ex03.format(x03));
		System.out.println("x04 = " + ex03.format(x04));
	}

}
