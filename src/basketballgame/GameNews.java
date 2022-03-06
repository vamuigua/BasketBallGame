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
public class GameNews implements Observer{
    
    @Override
    public void update(Observable obj, Object arg){
        int[] currentScores = (int[])arg; 
        int gameQuarter = currentScores[2];
        
        // Print Game News Piece based in Last Finished Game
        if(gameQuarter == 4){
            System.out.println("+==============================+");
            System.out.println("         LATEST NEWS            ");
            System.out.println("+==============================+");
            
            System.out.println("FINAL SCORES: [ TEAM A ] " + TrackScores.finalScoreA +" : "+  TrackScores.finalScoreB + " [ TEAM B ]");
            
            if(TrackScores.finalScoreA > TrackScores.finalScoreB){
                int diff = TrackScores.finalScoreA - TrackScores.finalScoreB;
                System.out.println("Team A beat Team B by " + diff + " point(s) in a tightly contested game.");
            }else if(TrackScores.finalScoreA < TrackScores.finalScoreB){
                int diff = TrackScores.finalScoreB - TrackScores.finalScoreA;
                System.out.println("Team B beat Team A by " + diff + " point(s) in a tightly contested game.");
            }else if(TrackScores.finalScoreA == TrackScores.finalScoreB){ 
                System.out.println("Its a Draw. Team A and Team B have " + TrackScores.finalScoreA + " point(s) each. What a Game!");
            }
        }
    }
    
}
