/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * @author Deepinder Kaur, 2026
 * @author Sophia Javed, 2026
 */
public class MemoryPlayer extends Player {
    private int score = 0;
    private ArrayList<Card> matchedCards; // pair of cards - gives player a point
    
    public MemoryPlayer(String name) {
        super(name);
        matchedCards = new ArrayList<>();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    // adds 1 to the score when player finds a pair
    public void increaseScore() {
        score++;
    }

    public ArrayList<Card> getMatchedCards() {
        return matchedCards;
    }

    public void setMatchedCards(ArrayList<Card> matchedCards) {
        this.matchedCards = matchedCards;
    }
    
    // puts the two matched cards into this players pile
    public void addMatchedCards(Card firstCard, Card secondCard) {
        matchedCards.add(firstCard);
        matchedCards.add(secondCard);
    }
    
    @Override
    public void play() {
        System.out.println();
        System.out.println("Turn: " + getName());
    }
    
}