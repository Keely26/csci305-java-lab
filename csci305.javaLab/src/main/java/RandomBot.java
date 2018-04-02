package main.java;

import java.util.Random;

public class RandomBot extends Player {
    public RandomBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        //randomly picks one of the five options from moves
        Random random = new Random();
        int randNum = random.nextInt((5 - 1) + 1);

        switch (randNum) {
            case 0:
                return new Rock("Rock");

            case 1:
                return new Paper("Paper");

            case 2:
                return new Scissors("Scissors");

            case 3:
                return new Lizard("Lizard");

            case 4:
                return new Spock("Spock");
        }

        return null;
    }
}
