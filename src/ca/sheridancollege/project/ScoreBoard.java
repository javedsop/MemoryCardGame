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
public class ScoreBoard {
    public void display(ArrayList<Player> players) {
        System.out.println();
        System.out.println("Current Scores:");
        for (Player player : players) {
            // convert Player player into a MemoryPlayer object using ()
            MemoryPlayer memoryPlayer = (MemoryPlayer) player;
            System.out.println(memoryPlayer.getName() + " has " + memoryPlayer.getScore() + " pair(s)");
        }
    } 
}
