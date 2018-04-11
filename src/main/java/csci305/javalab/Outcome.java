package csci305.javalab;

public class Outcome {

    private String outcome; //      represents the outcome of round "rock crushes scissors"
    private String result; //       represents the result of the round: win, lose, tie

    public Outcome(String outcome, String result){
        this.outcome = outcome;
        this.result = result;
    }

    public String toString(){
        return outcome + " -- " + result;
    }

}
