package csci305.javalab;

public class IterativeBot extends Player {
    public IterativeBot(String name){
        super(name);
    }

    /*
        Returns the next Element in Map moves
        based on Element passed as parameter (players previous move)
     */
    @Override
    public Element play(Element move) {
        if (move.getName() == "Rock") {//               if previous move is Rock
            return Main.moves.get("Paper");//           return Element Paper

        } else if (move.getName() == "Paper") {//       if previous move is Paper
             return Main.moves.get("Scissors");//       return Element Scissors

        } else if (move.getName() == "Scissors") {//    if previous move is Scissors
            return Main.moves.get("Lizard");//          return Element Lizard

        } else if (move.getName() == "Lizard") {//      if previous move is Lizard
            return Main.moves.get("Spock");//           return Element Spock

        } else {//                                      if previous move is Spock
            return Main.moves.get("Rock");//            return Element Rock
        }
    }
}
