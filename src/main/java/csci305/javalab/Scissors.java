package csci305.javalab;

public class Scissors extends Element {
    public Scissors(String element) {
        super(element);
    }

    /*
        Returns the Outcome of the Element Scissors vs _______
     */
    @Override
    public Outcome compareTo(Element e) {
        Outcome outcome = null;

        switch (e.getName()){
            case "Rock"://                                                                              Scissors vs Rock
                outcome = new Outcome("Rock crushes Scissors", "Scissors Lose");
                break;

            case "Paper"://                                                                             Scissors vs Paper
                outcome = new Outcome("Scissors cut Paper", "Scissors Win");
                break;

            case "Scissors"://                                                                          Scissors vs Scissors
                outcome = new Outcome("Scissors equals Scissors", "Tie");
                break;

            case "Lizard"://                                                                            Scissors vs Lizard
                outcome = new Outcome("Scissors decapitate Lizard", "Scissors Win");
                break;

            case "Spock"://                                                                             Scissors vs Spock
                outcome = new Outcome("Spock smashes Scissors", "Scissors Lose");
                break;
        }
        return outcome;
    }
}
