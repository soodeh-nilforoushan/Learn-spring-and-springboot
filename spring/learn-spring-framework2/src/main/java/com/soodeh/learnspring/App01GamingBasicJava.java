package com.soodeh.learnspring;

import com.soodeh.learnspring.game.GameRunner;
import com.soodeh.learnspring.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        MarioGame game=new MarioGame();
//        SuperContarGame game=new SuperContarGame();

        PacmanGame game=new PacmanGame();
        GameRunner gameRunner=new GameRunner(game);
        gameRunner.run();
    }
}
