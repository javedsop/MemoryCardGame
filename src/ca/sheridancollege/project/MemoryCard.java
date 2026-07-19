/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

/**
 *
 * @author Sophia Javed, 2026
 */
public class MemoryCard extends Card {
    
    public enum Fruit {
        APPLE,
        ORANGE,
        PAIR,
        BANANA,
        GRAPE,
        POMEGRANATE,
        KIWI,
        PINEAPPLE,
        WATERMELON,
        MANGO,
        CHERRY,
        PEACH,
        APRICOT
    }
    
    private Fruit fruit;

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
    
    
        @Override
        public String toString() {
            return String.format("formatted card");
            // example of this but for an Employee object:
//            return String.format("Employee Name: %s\nID: %d\nDepartment " + 
//            "Name: %s\nPosition: %s", name, id, department, position);
        }
}
