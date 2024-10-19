package gamehub;
import java.util.Random;
import java.util.Scanner;


public class RockPaperGame {
	
	    private static final String[] choices = {
	            "Rock", "Paper", "Scissors"
	    };

	    public static void main(String[] args) {
	    	RockPaperGame game = new RockPaperGame();
	        game.startGame();
	    }

	    public void startGame() {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        while (true) {
	            int user = getUserInput(scanner);
	            System.out.println("\n You Choose: " + choices[user]);

	            int com = random.nextInt(3); // Random choice between 0 and 2
	            System.out.println(" Computer chose: " + choices[com]);

	            // Determine the outcome
	            if (com == user) {
	                System.out.println("\n\n\tIT IS A DRAW");
	            } else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
	                System.out.println("\n    CONGRATS\nYOU WON THE MATCH");
	            } else {
	                System.out.println("\n\t SORRY \n  YOU LOSE THE MATCH");
	            }

	            // Ask to play again
	            System.out.print("\n\n Do you want to play again? (Y/N): ");
	            String playAgain = scanner.next().toLowerCase();
	            if (!playAgain.equals("y")) {
	                System.out.println("\n Thank you for playing...! I hope you enjoyed the game.");
	                break;
	            } else {
	                System.out.println("\n Starting a new game...\n");  // Indicate a new game will start
	            }
	        }
	        scanner.close();
	    }

	    private int getUserInput(Scanner scanner) {
	        int userInput = -1;
	        while (userInput < 0 || userInput > 2) {
	            try {
	                System.out.println("\n\n    --------------Rock-Paper-Scissors--------------");
	                System.out.print("\n\n 0 for Rock \n 1 for Paper \n 2 for Scissors \n\n Choose your Option (0/1/2): ");
	                userInput = scanner.nextInt();
	                if (userInput < 0 || userInput > 2) {
	                    System.out.println("Invalid input! Enter 0/1/2 ");
	                }
	            } catch (Exception e) {
	                System.out.println("Invalid input! Please enter a number:");
	                scanner.next(); // Clear the invalid input
	            }
	        }
	        return userInput;
	    }
	}
