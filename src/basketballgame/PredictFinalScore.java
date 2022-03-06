/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basketballgame;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Victor Allen
 */
public class PredictFinalScore implements Observer {
    
    @Override
    public void update(Observable obj, Object arg) {
        System.out.println("Predicted Final Scores " + "\n" +
                "Team A: " + (TrackScores.finalScoreA + 2) + "\n" +
                "Team B: " + (TrackScores.finalScoreB + 2)+ "\n");
        
    }
    
}
