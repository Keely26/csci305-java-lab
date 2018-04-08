package main.java;

import java.util.Scanner;

public class Human extends Player {
    public Human(String name) {
        super(name);
    }

    @Override
    public Element play(Element move) {
        Scanner scan = new Scanner(System.in);
        //Element move = null;

        //print the options
        System.out.println("Please select a move: \n" +
                "(1) : Rock\n" +
                "(2) : Paper\n" +
                "(3) : Scissors\n" +
                "(4) : Lizard\n" +
                "(5) : Spock\n");

        //request input from the user
        int n = scan.nextInt();

        //ask for input again in out of range
        while(n < 1 || n > 5) {
            System.out.println("Invalid input. Please try again:");
            n = scan.nextInt();
        }

        switch (n) {
            case 1:
                //System.out.println("ROCK");
                move = new Rock("Rock");
                break;

            case 2:
                //System.out.println("PAPER");
                move =  new Paper("Paper");
                break;

            case 3:
                //System.out.println("SCISSORS");
                move =  new Scissors("Scissors");
                break;

            case 4:
                //System.out.println("LIZARD");
                move =  new Lizard("Lizard");
                break;

            case 5:
                //System.out.println("SPOCK");
                move =  new Spock("Spock");
                break;
        }
        return move;
    }
}
