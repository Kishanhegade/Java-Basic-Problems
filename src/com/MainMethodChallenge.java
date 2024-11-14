package com;

public class MainMethodChallenge {
    static void displayHighScorePosition(String name,int position){
        System.out.println(name+" managed to get position "+position+" on the high score list.");
    }
    static int calculateHighScorePosition(int score){
        if(score>=1000)
            return 1;
        else if(score>=500)
            return 2;
        else if(score>=100)
            return 3;
        else
            return 4;
    }

    public static void main(String[] args) {
        displayHighScorePosition("Tom",2);
        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(1000));
        System.out.println(calculateHighScorePosition(500));
        System.out.println(calculateHighScorePosition(100));
        System.out.println(calculateHighScorePosition(25));
    }
}
