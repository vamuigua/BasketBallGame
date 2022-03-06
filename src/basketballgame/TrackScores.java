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
public class TrackScores implements Observer {
    public static int finalScoreA = 0;
    public static int finalScoreB = 0;
    
    String leftAlignFormat = "| %-4s | %-6s | %-6s |%n";

    @Override
    public void update(Observable obj, Object arg){
        int[] currentScores = (int[])arg;
        int TeamAScore = currentScores[0];
        int TeamBScore = currentScores[1];
        int gameQuarter = currentScores[2];
        
        finalScoreA += TeamAScore;
        finalScoreB += TeamBScore;
        
        System.out.format("\n");
        
        System.out.format("+------+--------+--------+%n");
        System.out.format("| GAME | TEAM A | TEAM B |%n");
        System.out.format("+------+--------+--------+%n");
        
        System.out.format(leftAlignFormat, gameQuarter, TeamAScore, TeamBScore);
        
        System.out.format("+------+--------+--------+%n");
    }
}
