// Java program for the above approach
import java.util.Scanner;

public class Numberguessinggame {
public static void guessingNumberGame()
	{
		
		Scanner sc = new Scanner(System.in);

		int number = 1 + (int)(100 * Math.random());

		int K = 5;

		int i, guess;

		System.out.println(
			"A random number is chosen"
			+ " between 1 to 100."
			+ "Guess the actual number"
			+ " within 5 trials.");

		
		for (i = 0; i < K; i++) {

			System.out.println("Guess the actual number:");

			guess = sc.nextInt();
			if (number == guess) {System.out.println(
					"Congratulations!"+ "That You have guessed the number.");
				break;
			}
			else if (number > guess && i != K - 1) {System.out.println("The number is "+ "actually greater than " + guess);
			}
			else if (number < guess && i != K - 1) {System.out.println("The number is"+ "actually less than " + guess);
			}
		}

		if (i == K) {
			System.out.println(
				"You are exhausted" + " K trials.");

			System.out.println("The guessed number was " + number);
		}
	}

	public static void
	main(String arg[])
	{

		guessingNumberGame();
	}
}
