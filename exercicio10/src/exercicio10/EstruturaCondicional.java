package exercicio10;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gameStart;
		int endOfGame;
		
		
		System.out.print("Game start time:");
		gameStart = sc.nextInt();
		System.out.print("End time of game:");
		endOfGame = sc.nextInt();
		
		
		int gameTime;
		int restOfDay;
		
		
		if (gameStart > 23  || gameStart < 0 && endOfGame > 23  || endOfGame < 0) {
			System.out.print("Please enter a valid time.");
		}
		
		if (gameStart < endOfGame) {
			gameTime = endOfGame - gameStart;
			
			if(gameTime >= 1 && gameTime <= 24) {
				System.out.printf("The game lasted %d hour(s)." , gameTime );
				
			} 
			
			
		} else if (gameStart > endOfGame) {
			restOfDay = 24 - gameStart;
			gameTime = restOfDay + endOfGame;
			
			if(gameTime >= 1 && gameTime <= 24) {
				System.out.printf("The game lasted %d hour(s)." , gameTime );
				
				} 
			
			
		} else if (gameStart == endOfGame && gameStart < 24 && endOfGame  < 24) {
			System.out.print("The game lasted 24 hour(s).");
			
		}
		
		sc.close();

	}

}
