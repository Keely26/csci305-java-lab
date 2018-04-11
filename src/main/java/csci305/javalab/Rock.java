package csci305.javalab;

public class Rock extends Element {
    public Rock(String element) {
        super(element);
    }

    /*
        Returns the Outcome of the Element Rock vs _______
    */
    @Override
    public Outcome compareTo(Element e) {
        Outcome outcome = null;

        switch (e.getName()){
            case "Rock"://                                                                  Rock vs Rock
                outcome = new Outcome("Rock equals Rock", "Rock Tie");
                break;

            case "Paper"://                                                                 Rock vs Paper
                outcome = new Outcome("Paper covers Rock", "Rock Lose");
                break;

            case "Scissors"://                                                              Rock vs Scissors
                outcome = new Outcome("Rock crushes Scissors", "Rock Win");
                break;

            case "Lizard"://                                                                Rock vs Lizard
                outcome = new Outcome("Rock crushes Lizard", "Rock Win");
                break;

            case "Spock"://                                                                 Rock vs Spock
                outcome = new Outcome("Spock vaporizes Rock", "Rock Lose");
                break;
        }
        return outcome;
    }

}
