package csci305.javalab;

public class Spock extends Element {
    public Spock(String element) {
        super(element);
    }

    /*
        Returns the Outcome of the Element Spock vs _______
     */
    @Override
    public Outcome compareTo(Element e) {
        Outcome outcome = null;

        switch (e.getName()){
            case "Rock"://                                                                      Spock vs Rock
                outcome = new Outcome("Spock vaporizes Rock", "Spock Win");
                break;

            case "Paper"://                                                                     Spock vs Paper
                outcome = new Outcome("Paper disproves Spock", "Spock Lose");
                break;

            case "Scissors"://                                                                  Spock vs Scissors
                outcome = new Outcome("Spock smashes Scissors", "Spock Win");
                break;

            case "Lizard"://                                                                    Spock vs Lizard
                outcome = new Outcome("Lizard poisons Spock", "Spock Lose");
                break;

            case "Spock"://                                                                     Spock vs Spock
                outcome = new Outcome("Spock equals Spock", "Tie");
                break;

        }
        return outcome;
    }
}
