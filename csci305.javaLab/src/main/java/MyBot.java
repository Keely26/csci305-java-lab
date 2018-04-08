package main.java;

import java.util.Random;

public class MyBot extends Player {
    public MyBot(String name) {
        super(name);
    }

    @Override
    //takes the opponents last move and returns an option that beats it
    public Element play(Element move) {
        Random random = new Random();
        int randNum = random.nextInt((2) + 1);

        if (move.getName() == "Rock") {
            if (randNum == 1) {
                return new Paper("Paper");
            } else {
                return new Spock("Spock");
            }

        } else if (move.getName() == "Paper") {
            if (randNum == 1) {
                return new Scissors("Scissors");
            } else {
                return new Lizard("Lizard");
            }

        } else if (move.getName() == "Scissors") {
            if (randNum == 1) {
                return new Spock("Spock");
            } else {
                return new Rock("Rock");
            }

        } else if (move.getName() == "Lizard") {
            if (randNum == 1) {
                return new Rock("Rock");
            } else {
                return new Scissors("Scissors");
            }

        } else { //(move.getName() == "Spock")
            if (randNum == 1) {
                return new Paper("Paper");
            } else {
                return new Lizard("Lizard");
            }
        }
    }
}

