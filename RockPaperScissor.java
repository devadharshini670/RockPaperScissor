package Games;  

import java.util.Scanner; 
import java.util.Random;  

public class RockPaperScissor {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        while (true) {  // Loop to allow replay
            String[] options = {"r", "p", "s"};  
            Random random = new Random();  
            String computerMove = options[random.nextInt(options.length)];  
            String playerMove = "";  

            while (true) {  
                System.out.println("Choose your move: Rock (r), Paper (p), or Scissors (s)");  
                playerMove = sc.nextLine().toLowerCase(); // Convert user input to lowercase  

                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {  
                    break; // Exit loop if valid input  
                }  
                System.out.println(playerMove + " is not a valid move. Please choose again.");  
            }  

            System.out.println("Computer played: " + computerMove);  
            
            if (playerMove.equals("r")) {  
                if (computerMove.equals("p")) {  
                    System.out.println("You lose!");  
                } else if (computerMove.equals("s")) {  
                    System.out.println("You won the match!");  
                } else {  
                    System.out.println("The match was a tie!");  
                }  
            } else if (playerMove.equals("p")) {  
                if (computerMove.equals("s")) {  
                    System.out.println("You lose!");  
                } else if (computerMove.equals("r")) {  
                    System.out.println("You won the match!");  
                } else {  
                    System.out.println("The match was a tie!");  
                }  
            } else { // playerMove.equals("s")  
                if (computerMove.equals("r")) {  
                    System.out.println("You lose!");  
                } else if (computerMove.equals("p")) {  
                    System.out.println("You won the match!");  
                } else {  
                    System.out.println("The match was a tie!");  
                }  
            } 

            // Ask if the player wants to play again
            System.out.println("Play again? (yes/no): ");
            String playAgain = sc.nextLine().toLowerCase();  
            
            if (!playAgain.equals("yes") && !playAgain.equals("y")) {  
                System.out.println("Thanks for playing! Goodbye!");
                break;  // Exit the while loop and end the program  
            }
        }
        sc.close(); // Close the scanner  
    }  
}
