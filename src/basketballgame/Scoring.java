/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basketballgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

/**
 *
 * @author Victor Allen
 */

// Keeps track of the basketball game scores and the subscribers (observers) 
public class Scoring extends Observable{
    
    void updateScore() throws IOException{
        
        System.out.print("Welcome to Today's BasketBall Game:" + "\n");
        
        for(int i = 1; i <= 4; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Game " + i + " Scores:" + "\n");
            System.out.println("TEAM A: ");
            String sA = reader.readLine();
            System.out.println("TEAM B: ");
            String sB = reader.readLine();
            
            int scoreA = Integer.parseInt(sA);
            int scoreB = Integer.parseInt(sB);
            int gameQuarter = i;
            
            int [] scores = {scoreA, scoreB, gameQuarter};
            
            //set change
            setChanged();
            //notify observers for change
            notifyObservers(scores);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error Occurred.");
            }
        }
    }
}
