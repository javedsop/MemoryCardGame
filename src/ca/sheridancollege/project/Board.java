/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

/**
 * @author Deepinder Kaur, 2026
 * @author Sophia Javed, 2026
 */

public class Board {
    private static final int CARDS_PER_ROW = 5;   
    
    public void displayCards(GroupOfCards groupofCards) {
        System.out.println();
        for (int i = 0; i < groupofCards.getSize(); i++) {
            // Since i starts at 0, add 1 to the cards start from 1 and not 0
            int cardNumber = i + 1;
            if (groupofCards.getCard(i) == null) {
                System.out.printf("%-20s", cardNumber + ": NOT AN OPTION ");
            } else {
                System.out.printf( "%-20s",cardNumber + ": Card " + cardNumber);
            }
            /* Split the cards into rows using modulo
                This prints a line (system.out.println) after each 5 cards since 
                the remainder will be 0
            */
            if (cardNumber % CARDS_PER_ROW == 0) {
                System.out.println();
            }
        }
        
        // Add a new line after ALL the 10 cards have been displayed
        if (groupofCards.getSize() % CARDS_PER_ROW != 0) {
            System.out.println();
        }
    }
}
