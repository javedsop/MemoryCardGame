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
public class MemoryGame extends Game {
    private static final int NUMBER_OF_CARDS = 10;
    private GroupOfCards groupOfCards;
    private Board board;
    private ScoreBoard scoreBoard;
    private int currentPlayer = 0;

    public MemoryGame(String name, ArrayList<Player> players) {
        super(name);
        setPlayers(players);
        board = new Board();
        scoreBoard = new ScoreBoard();
    }

    public GroupOfCards getGroupOfCards() {
        return groupOfCards;
    }

    public void setGroupOfCards(GroupOfCards groupOfCards) {
        this.groupOfCards = groupOfCards;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ScoreBoard getScoreBoard() {
        return scoreBoard;
    }

    public void setScoreBoard(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }
    
    public void setUpBoard() {
        groupOfCards = new GroupOfCards(NUMBER_OF_CARDS);
        for (Fruit fruit : Fruit.values()) {
            groupOfCards.addCard(new MemoryCard(fruit));
            groupOfCards.addCard(new MemoryCard(fruit));
        }
        
        groupOfCards.shuffle();
        // display the current scores of the players
        scoreBoard.display(getPlayers());
        
        board.displayCards(groupOfCards);

    }
    

    @Override
    public void play(int card1, int card2) {
            System.out.println();
            MemoryPlayer player = (MemoryPlayer) getPlayers().get(currentPlayer);
            System.out.println("It is " + player.getName() + "'s turn.");
            
            Card firstCard = groupOfCards.getCard(card1 - 1);
            System.out.println("The 1st card you picked up was: " + firstCard);

            Card secondCard = groupOfCards.getCard(card2 - 1);
            System.out.println("The 2nd card you picked up was: " + secondCard);

            if (firstCard.getFruit() == secondCard.getFruit()) {
                System.out.println("Congratulations, the cards were a match!");
                groupOfCards.removeCard(card1 - 1);
                groupOfCards.removeCard(card2 - 1);

                player.increaseScore();
                player.addMatchedCards(firstCard, secondCard);
                System.out.println(player.getName() + " gets 1 point.");
                /* If all the cards are NOT MATCHED (meaning the game is still going on),
                   then display "playerName gets to go again". Because if the game has stopped
                   we don't want to print that the player goes again.
                */
                if (groupOfCards.allMatched() == false) {
                    System.out.println(player.getName() + " gets to go again!");
                }
            } else {
                System.out.println(  "Sorry, the cards were not a match.");
                currentPlayer = (currentPlayer + 1) % getPlayers().size();
            }
            
        /* If all the cards are NOT MATCHED (meaning the game is still going on),
           then display the player scores and cards but if all cards ARE MATCHED, then it 
           will stop displaying player scores and the cards!
        */
        
        if (groupOfCards.allMatched() == false) {
            board.displayCards(groupOfCards);
            scoreBoard.display(getPlayers());
        }
        
        if (groupOfCards.allMatched()) {
            declareWinner(getPlayers());
        }
    }

    @Override
    public void declareWinner(ArrayList<Player> players) {
        int highestScore = -1;
        for (Player player : players) {
            // convert the Player into a MemoryPlayer
            MemoryPlayer memoryPlayer = (MemoryPlayer) player;
            if (memoryPlayer.getScore() > highestScore) {
                highestScore = memoryPlayer.getScore();
                System.out.println();
                System.out.println();
                System.out.println("And the winner is... ");
                System.out.println();
                System.out.println(memoryPlayer.getName() + "!");
                System.out.println(memoryPlayer.getName()+ " finished with " + highestScore + " points!");
            }
        }
    }
}
