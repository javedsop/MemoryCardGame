/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Sophia Javed, 2026
 */
public class PlayMemory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // game will be placed in a While Loop
        while (true) {
            
        
        Scanner in = new Scanner(System.in);
        
        
        
        System.out.println("Enter number of players: ");
        int numPlayers = in.nextInt();
        in.nextLine(); // clear buffer

        for (int i = 0; i < numPlayers; i++) {
            System.out.printf("Enter name of player #%d: ", i + 1);
            String players = in.nextLine();
            
        }
        
            System.out.println("Select S to play");
        
        
        System.out.println("The players playing Memory will be: ");
        
        }
    }

}
