//
//	Name:		Chen, Harrison
//	Project:	2
//	Due:		Friday Februaruy 22, 2019
//	Course:		cs-1400-03-sp19
//
//	Description:
//			Guessing Game
//
import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{
	public static void main(String[] args){
		System.out.println("H. Chen's Guessing Game");
		System.out.println();
		System.out.println("A secret number between 1-100 has been generated...");
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		int secretNumber, userGuess, guessCount;
		secretNumber = rand.nextInt(100) + 1;
		guessCount = 1;
		System.out.println();
		System.out.print("Enter your guess? ");
		userGuess = keyboard.nextInt();
		while(userGuess != 0 && secretNumber != userGuess){
			if(secretNumber < userGuess){
				System.out.println("Guess is high, try again.");
			}else{
				System.out.println("Guess is low, try again.");
			}
			System.out.print("Enter your guess? ");
                	userGuess = keyboard.nextInt();
			guessCount++;
		}
		if(userGuess == 0){
                	System.out.println("The secret number is " + secretNumber + ".");
                }else if(secretNumber == userGuess){
                	System.out.println("Correct in " + guessCount + " guesses.");
                }
	}
}
