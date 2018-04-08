package main.java;

import java.util.Random;

public class RandomBot extends Player {
    public RandomBot(String name) {
        super(name);
    }

    @Override
    public Element play(Element move) {
        Element playerMove = null;

        //randomly picks one of the five options from moves
        Random random = new Random();
        int randNum = random.nextInt((5 - 1) + 1);

        switch (randNum) {
            case 0:
                playerMove = new Rock("Rock");
                break;
            case 1:
                playerMove = new Paper("Paper");
                break;
            case 2:
                playerMove = new Scissors("Scissors");
                break;
            case 3:
                playerMove = new Lizard("Lizard");
                break;
            case 4:
                playerMove = new Spock("Spock");
                break;
        }

        return playerMove;
    }
}
