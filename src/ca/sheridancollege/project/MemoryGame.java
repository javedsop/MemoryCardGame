/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Sophia Javed, 2026
 */
public class MemoryGame extends Game {
    private GroupOfCards groupOfCards; 
    private boolean flipped; // which card has been flipped
    private ArrayList<MemoryPlayer> memoryPlayers;
        
        // deals with making the actual game - not starting the game. starting
        // the game is dealt by the abstract play() method.
        
        // constructor inheriting superclass fields/properties
        // can make a different constructor if needed
    public MemoryGame(String name, ArrayList<Player> players, GroupOfCards groupOfCards, boolean flipped, ArrayList<MemoryPlayer> memoryPlayers) {
        super(name, players);
        this.groupOfCards = groupOfCards;
        this.flipped = flipped;
        this.memoryPlayers = memoryPlayers;
    }

    public GroupOfCards getGroupOfCards() {
        return groupOfCards;
    }

    public void setGroupOfCards(GroupOfCards groupOfCards) {
        this.groupOfCards = groupOfCards;
    }

    public boolean isFlipped() {
        return flipped;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    public ArrayList<MemoryPlayer> getMemoryPlayers() {
        return memoryPlayers;
    }

    public void setMemoryPlayers(ArrayList<MemoryPlayer> memoryPlayers) {
        this.memoryPlayers = memoryPlayers;
    }
        
    @Override
    public String getName() {
        return "Memory";
    }
        
        
    @Override
    // in main method, Scanner will take in numPlayers and an arrayList of Players
    public void play(int numPlayers, ArrayList<Player> players) {
        
        for (int i = 0; i < numPlayers; i++) {
            setPlayers(players); // set the players of the game
        }
    }
        
    @Override
    public void declareWinner() {
    }
}
