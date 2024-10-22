package project1;
import java.util.Scanner;
import java.util.Random;

public class numberguessinggame {

	    private static final int MAX_ATTEMPTS = 5;
	    private static final int RANGE = 100;
	    private static int score = 0;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean playAgain = true;

	        System.out.println("Welcome to the Number Guessing Game!");

	        while (playAgain) {
	            playRound(scanner);

	            System.out.println("Do you want to play again? (yes/no): ");
	            String response = scanner.nextLine().toLowerCase();
	            playAgain = response.equals("yes");
	        }

	        System.out.println("Thanks for playing! Your total score is: " + score);
	        scanner.close();
	    }

	    public static void playRound(Scanner scanner) {
	        Random random = new Random();
	        int targetNumber = random.nextInt(RANGE) + 1;
	        int attempts = 0;
	        boolean hasGuessed = false;

	        System.out.println("Guess a number between 1 and " + RANGE + ":");

	        while (attempts < MAX_ATTEMPTS && !hasGuessed) {
	            attempts++;
	            System.out.print("Attempt " + attempts + ": ");
	            int userGuess = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            if (userGuess == targetNumber) {
	                System.out.println("Congratulations! You guessed the correct number.");
	                hasGuessed = true;
	                score += (MAX_ATTEMPTS - attempts + 1); // Higher score for fewer attempts
	            } else if (userGuess < targetNumber) {
	                System.out.println("Too low! Try again.");
	            } else {
	                System.out.println("Too high! Try again.");
	            }
	        }

	        if (!hasGuessed) {
	            System.out.println("You've used all your attempts! The correct number was: " + targetNumber);
	        }

	        System.out.println("Round over. Your current score: " + score + "\n");
	    }
	}

