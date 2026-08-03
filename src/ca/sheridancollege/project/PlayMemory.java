/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Deepinder Kaur, 2026
 * @author Sophia Javed, 2026
 */
public class PlayMemory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Game will be kept inside of a while loop
        while (true) {
            
            Scanner in = new Scanner(System.in);
            
            System.out.println("MEMORY");
            System.out.println("There are 10 cards that have fruits.");
            System.out.println("5 cards have a different fruit and each of those cards have a matching pair, which totals up to 10 cards.");
            System.out.println("It is your job to remember which fruit belongs to which card number, hence the name memory!");
            System.out.println();
            System.out.println("Rules:");
            System.out.println("Select two different card numbers.");
            System.out.println("The fruit on each selected card will be revealed.");
            System.out.println("If the cards match, you gain one point and go again.");
            System.out.println("If the cards do not match, the game moves to the next player.");
            System.out.println("The player with the most pairs wins!!!");
            System.out.println();
            
            // create list of players
            ArrayList<Player> players = new ArrayList<>();

            // initialize numPlayers
            int numPlayers = 0;

            while (true) {
                try {
                    System.out.print("Enter number of players that will be playing Memory: ");
                    numPlayers = in.nextInt();
                    if (numPlayers <= 1) {
                        throw new IllegalArgumentException("Sorry, there must be at least 2 players to play. Please try again.");
                    }
                    break; // exit loop if user enters a valid number
                } catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            in.nextLine(); // clears buffer after in.nextInt()
            
            for (int i = 0; i < numPlayers ; i++) {
                // validate playerName
                while (true) {
                    try {
                        System.out.print("Enter Player #" + (i + 1) + "'s name: ");
                        String playerName = in.nextLine();
                        if (playerName == null || playerName.isBlank()) {
                            throw new IllegalArgumentException( "Sorry, player name cannot be empty. Please try again.");
                        }
                        // after playerName is validated, add the player as a MemoryPlayer
                        players.add(new MemoryPlayer(playerName));
                        break; // exit loop if user enters correct name
                    } catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                }
            }
            
            System.out.println();
            System.out.println("Options:");
            System.out.println("Choose S to Start the game.");
            System.out.println("Choose E to Exit the game.");
            System.out.print("Enter option (S/E): ");
            String gameOption = in.nextLine();

            if (gameOption.equalsIgnoreCase("E")) {
                System.out.println("You have chose to end the game. Hope to see you again soon. Goodbye!");
                // BREAK FROM THE BIG WHILE LOOP!
                break;
            }
            
            MemoryGame game = new MemoryGame("Memory", players);
            
            game.setUpBoard();
            
            // While the cards have not been matched yet (false), continue the loop
            // When all the cards have been matched, stop the while loop!!
            while (game.getGroupOfCards().allMatched() == false) {
                System.out.println("For your first card, select a number from 1-10: ");
                int card1 = in.nextInt();

                System.out.println("For your second card, select a number from 1-10: ");
                int card2 = in.nextInt();

                game.play(card1, card2);
                in.nextLine(); // clears buffer after in.nextInt()
            }
            
            System.out.println();
            System.out.println();
            System.out.println("Would you like to play Memory again? (Y/N): ");
            String answer = in.nextLine();
            
            if (answer.toUpperCase().equals("Y")) {
                // big while loop will run again
            } else {
                // stop the big while loop
                System.out.println("You have chose to end the game. Hope to see you again soon. Goodbye!");
                break;
            }
            System.out.println();
               
        }

    }
}