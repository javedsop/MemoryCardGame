/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @modifer Sophia Javed, 2026
 * @modifier Deepinder Kaur, 2026
 */
public class GroupOfCards {

    // The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
        cards = new ArrayList<>();
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    // Add card to GroupOfCards
    public void addCard(Card card) {
        if (cards.size() < size) {
            cards.add(card);
        }
    }

    public Card getCard(int i) {
        return cards.get(i);
    }

    public void removeCard(int i) {
        cards.set(i, null);
    }

    public boolean allMatched() {
        for (Card card : cards) {
            // If card is not null then return false
            if (card != null) {
                return false;
            }
        }
        // otherwise return true
        return true;
    }

} //end class
