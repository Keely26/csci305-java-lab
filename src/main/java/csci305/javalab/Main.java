package csci305.javalab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static final Map<String, Element> moves = new HashMap<>();

    /*
        Controls game
     */
    public static void main(String args[]) {
        int p1Score = 0, p2Score = 0, tie = 0;//                                    variables used to track player's score
        Element p1CurMove, p2CurMove, p1PrevMove = null, p2PrevMove = null;//       variables used to track player's moves

        moves.put("Rock", new Rock("Rock"));//                              Populate moves with each Element type
        moves.put("Paper", new Paper("Paper"));
        moves.put("Scissors", new Scissors("Scissors"));
        moves.put("Spock", new Spock("Spock"));
        moves.put("Lizard", new Lizard("Lizard"));


        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, " +//  welcome message that displays my name
                "implemented by Keely Weisbeck.");


        System.out.println("  Please choose two players:\n" +//                     print list of player options
                "     (1) Human\n" +
                "     (2) StupidBot\n" +
                "     (3) RandomBot\n" +
                "     (4) IterativeBot\n" +
                "     (5) LastPlayBot\n" +
                "     (6) MyBot");

        System.out.println("Select Player 1: ");//                                  prompt user to select player 1 from list
        Player p1 = selectPlayer();

        System.out.println("Select player 2: ");//                                  prompt user to select player 2 from list
        Player p2 = selectPlayer();

        System.out.println(p1.getName() + " vs " + p2.getName() + ". Go!");//       print who is playing who (signals start of game)
        System.out.println("\n");


        for (int i = 1; i < 6; i++) {
            System.out.println("Round " + i + ": ");//                                                  print round number

            p1CurMove = getPlayerMove(p1.getName(), p1, p2PrevMove, p1PrevMove);//                      get player 1 move
            System.out.println("    Player 1 (" + p1.getName() + ") chose: " + p1CurMove.getName());//  print player 1 move

            p2CurMove = getPlayerMove(p2.getName(), p2, p1PrevMove, p2PrevMove);//                      get player 2 move
            System.out.println("    Player 2 (" + p2.getName() + ") chose: " + p2CurMove.getName());//  print player 2 selection



            String outcome = String.valueOf(p1CurMove.compareTo(p2CurMove));//      get outcome of round
            String[] parts = outcome.split(" ");
            String lastWord = parts[parts.length - 1];//                            get the last word from outcome

            if (lastWord.equals("Win")) {//                                         if last word is 'win'
                System.out.println("    Player 1 won the round");//                 print player 1 is winner of round
                p1Score = p1Score + 1;//                                            add 1 to player 1 score

            } else if (lastWord.equals("Lose")){//                                  if last word is 'lose'
                System.out.println("    Player 2 won the round");//                 print player 2 is winner of round
                p2Score = p2Score + 1;//                                            add 1 to player 2 score

            } else {//                                                              if last word is 'tie'
                System.out.println("    Round was a tie");//                        print round was a tie
                tie = tie + 1;//                                                    add 1 to tie

            }

            p1PrevMove = p1CurMove;//                                               set player's current move to
            p2PrevMove = p2CurMove;//                                               be player's previous move
            System.out.println("\n");

        }

        System.out.println("The score is " + p1Score + " to " + p2Score);// print the overall score
        if(p1Score > p2Score){//                                            print the overall winner
            System.out.println("Player 1 Wins");
        } else if (p1Score < p2Score) {
            System.out.println("Player 2 Wins");
        } else{//                                                           or print game was a tie
            System.out.println("Game was a draw");
        }

    }

    /*
        gets user input and returns and creates a new player of selected type
     */
    public static Player selectPlayer() {
        Player player = null;

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        while (choice < 1 || choice > 6) {//                        prompt user to try again until user input is in range
            System.out.println("Invalid input. Please try again:");
            choice = scan.nextInt();
        }
        switch (choice) {
            case 1://                                           set player as a Human
                player = new Human("human");
                break;
            case 2://                                           set player as a StupidBot
                player = new StupidBot("stupid");
                break;
            case 3://                                           set player as a RandomBot
                player = new RandomBot("random");
                break;
            case 4://                                           set player as a IterativeBot
                player = new IterativeBot("iterative");
                break;
            case 5://                                           set player as a LastPlayBot
                player = new LastPlayBot("lastPlay");
                break;
            case 6://                                           set player as a MyBot
                player = new MyBot("myBot");
                break;
        }
        return player;
    }


    /*
        returns player move based on user name, type, and previous move
     */
    public static Element getPlayerMove(String name, Player player, Element opponentPrevMove, Element prevMove) {
        Element playerMove = null;
        switch (name) {
            case "human":
                playerMove = player.play(null);//             get human move
                break;

            case "stupid":
                playerMove = player.play(null);//             get stupid move
                break;

            case "random":
                playerMove = player.play(null);//             get random move
                break;

            case "iterative":
                if(prevMove == null) { //                           if first move of the game
                    Element temp = new Spock("Spock");
                    playerMove = player.play(temp); //              start at first input of Map (Rock)
                } else {
                    playerMove = player.play(prevMove); //          else get move based on prevMove
                }
                break;

            case "lastPlay":
                //
                if(opponentPrevMove == null) {//                            if first move of game
                    Player temp = new RandomBot("lastPlayRand");
                    playerMove = temp.play(null);//                  return random move using RandomBot
                } else {
                    playerMove = player.play(opponentPrevMove);//           else return move based on opponents previous move
                }
                break;

            case "myBot":
                if(opponentPrevMove == null) {//                            if first move of the game
                    Player temp = new RandomBot("lastPlayRand");
                    playerMove = temp.play(null);//                   return random move using RandomBot
                } else {
                    playerMove = player.play(opponentPrevMove);//           else return move based on opponents previous move
                }
                break;
        }
        return playerMove;
    }

}


