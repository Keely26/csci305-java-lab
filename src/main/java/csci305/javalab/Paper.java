package csci305.javalab;

public class Paper extends Element {
    public Paper(String element) {
        super(element);
    }

    /*
        Returns the Outcome of the Element Paper vs _______
     */
    @Override
    public Outcome compareTo(Element e) {
        Outcome outcome = null;

        switch (e.getName()){
            case "Rock"://                                                                  Paper vs Rock
                outcome = new Outcome("Paper covers Rock", "Paper Win");
                break;

            case "Paper"://                                                                 Paper vs Paper
                outcome = new Outcome("Paper equals Paper", "Paper Tie");
                break;

            case "Scissors"://                                                              Paper vs Scissors
                outcome = new Outcome("Scissors cut Paper", "Paper Lose");
                break;

            case "Lizard"://                                                                Paper vs Lizard
                outcome = new Outcome("Lizard eats Paper", "Paper Lose");
                break;

            case "Spock"://                                                                 Paper vs Spock
                outcome = new Outcome("Paper disproves Spock", "Paper Win");
                break;
        }
        return outcome;
    }
}
