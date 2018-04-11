package csci305.javalab;

import java.util.Scanner;

public class Human extends Player {
    public Human(String name) {
        super(name);
    }

    /*
        Prompts user to select an Element (move) from list
        and returns the selected Element
     */
    @Override
    public Element play(Element move) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please select a move: \n" + //  print the options
                "(1) : Rock\n" +
                "(2) : Paper\n" +
                "(3) : Scissors\n" +
                "(4) : Lizard\n" +
                "(5) : Spock\n");

        int n = scan.nextInt();//                           request input from the user


        while(n < 1 || n > 5) {//                                       if user input is out of range
            System.out.println("Invalid input. Please try again:");//   prompt user to try again
            n = scan.nextInt();
        }

        switch (n) {
            case 1://                                       if user selects 1 return Element Rock
                move = new Rock("Rock");
                break;

            case 2://                                       if user selects 2 return Element Paper
                move =  new Paper("Paper");
                break;

            case 3://                                       if user selects 3 return Element Scissors
                move =  new Scissors("Scissors");
                break;

            case 4://                                       if user selects 4 return Element Lizard
                move =  new Lizard("Lizard");
                break;

            case 5://                                       if user selects 5 return Element Spock
                move =  new Spock("Spock");
                break;
        }
        return move;
    }
}
