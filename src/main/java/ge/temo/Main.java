package ge.temo;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice = "";
        String computerChoice;
        String playAgain = "yes";

        System.out.print("Enter your move (rock, paper, scissors): ");
        String move = scanner.nextLine().toLowerCase();

        if (!move.equals("rock") && !move.equals("paper") && !move.equals("scissors")) {
            System.out.println("Invalid move!");
        }

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
            System.out.println("You win!");
        } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You win!");
        } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}