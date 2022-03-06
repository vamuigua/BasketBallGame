/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basketballgame;

import java.io.IOException;


/**
 *
 * @author Victor Allen
 */
public class BasketBallGame {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        Scoring observedScore = new Scoring();
        PredictFinalScore predictFinalScore = new PredictFinalScore();
        TrackScores trackScores = new TrackScores();
        GameNews gameNews = new GameNews();
        
        // Add observers, the first observer (GameNews) will be executed last
        observedScore.addObserver(gameNews);
        observedScore.addObserver(predictFinalScore);
        observedScore.addObserver(trackScores);
        
        // Start game
        observedScore.updateScore();
    }
}
