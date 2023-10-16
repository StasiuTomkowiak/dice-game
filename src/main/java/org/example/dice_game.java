package org.example;


import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;


public class dice_game {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(in);

        out.println("Welcome to the dice game! Choose the number of sides on the die: ");
        int numSides = scanner.nextInt();
        scanner.nextLine();

        RollDie player = new RollDie(numSides);
        RollDie computer = new RollDie(numSides);

        int playerResult = player.rollDie();
        int computerResult = computer.rollDie();

        out.println("Player's roll result: " + playerResult);
        out.println("Computer's roll result: " + computerResult);

        if (playerResult > computerResult) {
            out.println("Player wins!");
        } else {
            if (computerResult > playerResult) {
                out.println("Computer wins!");
            } else {
                out.println("It's a tie!");
            }
        }

        scanner.close();
    }
}
