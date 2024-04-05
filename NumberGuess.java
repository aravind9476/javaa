package com.codinghub;
import java.util.*;
public class NumberGuessingGame {
	static ArrayList<Integer> scoreBoard = new ArrayList<Integer>(); 

	public static void main(String args[])
	{
		NumberGuessingGame main=new NumberGuessingGame();
		main.menu(scoreBoard);

	}
	public void menu(ArrayList<Integer> scoreBoard)
	{
//		NumberGuessingGame main1=new NumberGuessingGame();
		Scanner s=new Scanner(System.in);
		System.out.println("***********"); 
		System.out.println("Welcome to the Number Guessing Game"); 
		System.out.println("1) Play the Game"); 
		System.out.println("2) Score Board"); 
		System.out.println("3) Exit the game"); 
		System.out.println("***********"); 
		System.out.println("what action do you prefer : ");
		int MenuOption=s.nextInt();
		switch(MenuOption){
		case 1:
			PlayStart();
			menu(scoreBoard);
			break;
		case 2:
			displayScoreBoard();
			menu(scoreBoard);
			break;
		case 3:
			System.out.println("Thank you for playing the game ");
			System.exit(0);
			break;
		}
	}
	public  void PlayStart() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int secretNumber = random.nextInt(100) + 1;
		int attempts = 0;
		boolean Guessed = false;
		System.out.println("I've chosen a number between 1 and 100. Try to guess it.");
		while (!Guessed) {
			System.out.print("Enter your guess: ");
			int guess = scanner.nextInt();
			attempts++;

			if (guess == secretNumber) {
				System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
				Guessed = true;
			} else if (guess < secretNumber) {
				System.out.println("Too low. Try again.");
			} else {
				System.out.println("Too high. Try again.");
			}
		}
		System.out.println(attempts);
		scoreBoard.add(attempts);
		System.out.println(scoreBoard);
	}
	public void displayScoreBoard() { 
		System.out.println("------------------------------"); 
		System.out.println("Score Board"); 
		System.out.println("------------------------------"); 
		System.out.println("Your fastest games today out of all tries is: " +"\n"); 
		Collections.sort(scoreBoard); 
		for (Integer temp : scoreBoard) { 
			System.out.println("Finished the number guessing game in " + temp + " tries"); 
		} 
		System.out.println(" "); 

	} 

}

