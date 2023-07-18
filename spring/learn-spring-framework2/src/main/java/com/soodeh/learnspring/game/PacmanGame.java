package com.soodeh.learnspring.game;

public class PacmanGame implements GamingConsole {
    public void up(){
        System.out.println("climbing");
    }
    public void down(){
        System.out.println("swimming");
    }

    public void right(){
        System.out.println("running");
    }
    public void left(){
        System.out.println("hiding");
    }
}
