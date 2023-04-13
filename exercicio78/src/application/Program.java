package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c01 = new Comment("Have a nice trip");
		Comment c02 = new Comment("Wow that's awesome!");
		Post post01 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 12);		
		post01.addComment(c01);
		post01.addComment(c02);
		System.out.println(post01);
		
		Comment c03 = new Comment("Good night");
		Comment c04 = new Comment("May the Force be with you");
		Post post02 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow", 5);
		post02.addComment(c03);
		post02.addComment(c04);
		System.out.println(post02);

		sc.close();
	}
}
