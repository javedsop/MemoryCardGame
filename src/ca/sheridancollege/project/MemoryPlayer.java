/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sophia Javed, 2026
 */
public class MemoryPlayer extends Player {
    private int score;
    private List<Card> matchedCards; // pair of cards - gives player a point
    private boolean turn; // turn of player
    
    public MemoryPlayer(String name, int score, List<Card> matchedCards, boolean turn) {
        super(name);
        this.score = score;
        this.matchedCards = matchedCards;
        this.turn = turn;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Card> getMatchedCards() {
        return matchedCards;
    }

    public void setMatchedCards(List<Card> matchedCards) {
        this.matchedCards = matchedCards;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }
    
    
    @Override
    public void play(ArrayList<Player> players) {
        
    }
    
    @Override
    public int score() {
        return this.score;
    }
}