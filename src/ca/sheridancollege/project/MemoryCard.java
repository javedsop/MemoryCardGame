/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

/**
 * @author Deepinder Kaur, 2026
 * @author Sophia Javed, 2026
 */
public class MemoryCard extends Card {
    
    public MemoryCard(Fruit fruit) {
        super(fruit);
    }
    
    @Override
    public String toString() {
        return getFruit().toString();
    }
    
}
