/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Sophia Javed July 2026
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    // added ArrayList<Player> players to constructor's parameter list
    public Game(String name, ArrayList<Player> players) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game.This might be one method or many method calls depending on your game.
     * @param numPlayers
     * @param players
     */
    public abstract void play(int numPlayers, ArrayList<Player> players);
    
    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();
    
//    public MemoryGame extends Game {
//        private GroupOfCards groupOfCards; 
//        private boolean flipped; // which card has been flipped
//        
//        // deals with making the actual game- not starting the game
//
//        // loop
        
//        // constructor inheriting superclass fields/properties
//        public MemoryGame(String name, Player players) {
//            super(String name, Player players);
//            
//        }
//        
//        @Override
//        public String getName() {
//            return "Memory";
//        }
//        
//        
//        
//        @Override
//        public void play() {
//            
//        }
//        
//        @Override
//        public void declareWinner() {
//            // code goes here
//        }
//        
//}
//

}//end class
