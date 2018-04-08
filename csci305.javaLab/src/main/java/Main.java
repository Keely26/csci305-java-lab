package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final Map<String, Element> moves = new HashMap<>();
    public static int i;

    public static void main(String args[]) {
        // populate moves
        moves.put("Rock", new Rock("Rock"));
        moves.put("Paper", new Paper("Paper"));
        moves.put("Scissors", new Scissors("Scissors"));
        moves.put("Spock", new Spock("Spock"));
        moves.put("Lizard", new Lizard("Lizard"));

        int p1Score = 0, p2Score = 0, tie = 0;


        //welcome message that displays my name
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Keely Weisbeck.");

        //have user select player 1 and player 2 from list
        System.out.println("  Please choose two players:\n" +
                "     (1) Human\n" +
                "     (2) StupidBot\n" +
                "     (3) RandomBot\n" +
                "     (4) IterativeBot\n" +
                "     (5) LastPlayBot\n" +
                "     (6) MyBot");

        Element p1CurMove;
        Element p2CurMove;

        Element p1PrevMove = null;
        Element p2PrevMove = null;

        System.out.println("Select Player 1: ");
        Player p1 = selectPlayer();

        System.out.println("Select player 2: ");
        Player p2 = selectPlayer();

        System.out.println(p1.getName() + " vs " + p2.getName() + ". Go!");
        System.out.println("\n");

        //use loop to simulate 5 rounds of play
        for (int i = 1; i < 6; i++) {
            System.out.println("Round " + i + ": ");

            p1CurMove = getPlayerMove(p1.getName(), p1, p2PrevMove, p1PrevMove);
            //print player 1 selection
            System.out.println("    Player 1 (" + p1.getName() + ") chose: " + p1CurMove.getName());

            //get player 2 move
            p2CurMove = getPlayerMove(p2.getName(), p2, p1PrevMove, p2PrevMove);
            //print player 2 selection
            System.out.println("    Player 2 (" + p2.getName() + ") chose: " + p2CurMove.getName());

            //print result
            String outcome = String.valueOf(p1CurMove.compareTo(p2CurMove));

            // keep track of result
            String[] parts = outcome.split(" ");
            String lastWord = parts[parts.length - 1];

            if (lastWord.equals("Win")) {
                System.out.println("    Player 1 won the round");
                p1Score = p1Score + 1;

            } else if (lastWord.equals("Lose")){
                System.out.println("    Player 2 won the round");
                p2Score = p2Score + 1;

            } else {
                System.out.println("    Round was a tie");
                tie = tie + 1;

            }

            p1PrevMove = p1CurMove;
            p2PrevMove = p2CurMove;

            System.out.println("\n");

        }


        //print the overall score
        System.out.println("The score is " + p1Score + " to " + p2Score);
        //print the overall winner
        if(p1Score > p2Score){
            System.out.println("Player 1 Wins");
        } else if (p1Score < p2Score) {
            System.out.println("Player 2 Wins");
        } else{
            System.out.println("Game was a draw");
        }

    }

    public static Player selectPlayer() {
        Player player = null;

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        while (choice < 1 || choice > 6) {
            System.out.println("Invalid input. Please try again:");
            choice = scan.nextInt();
        }
        switch (choice) {
            case 1:
                player = new Human("human");
                break;
            case 2:
                player = new StupidBot("stupid");
                break;
            case 3:
                player = new RandomBot("random");
                break;
            case 4:
                player = new IterativeBot("iterative");
                break;
            case 5:
                player = new LastPlayBot("lastPlay");
                break;
            case 6:
                player = new MyBot("myBot");
                break;
        }
        return player;
    }


    public static Element getPlayerMove(String name, Player player, Element opponentPrevMove, Element prevMove) {
        //Player player = null;
        Element playerMove = null;
        switch (name) {
            case "human":
                playerMove = player.play(null);
                break;

            case "stupid":
                playerMove = player.play(null);
                break;

            case "random":
                playerMove = player.play(null);
                break;

            case "iterative":
                if(prevMove == null) {
                    Element temp = new Spock("Spock");
                    playerMove = player.play(temp);
                } else {
                    playerMove = player.play(prevMove);
                }
                break;

            case "lastPlay":
                if(opponentPrevMove == null) {
                    Player temp = new RandomBot("lastPlayRand");
                    playerMove = temp.play(null);
                } else {
                    playerMove = player.play(opponentPrevMove);
                }
                break;

            case "myBot":
                if(opponentPrevMove == null) {
                    Player temp = new RandomBot("lastPlayRand");
                    playerMove = temp.play(null);
                } else {
                    playerMove = player.play(opponentPrevMove);
                }
                break;
        }
        return playerMove;
    }

}


