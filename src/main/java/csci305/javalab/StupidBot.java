package csci305.javalab;

public class StupidBot extends Player{

    public StupidBot(String name) {
        super(name);
    }

    /*
        Returns an Element of type Rock
     */
    @Override
    public Element play(Element move) {
        return new Rock("Rock");//  return Rock every time
    }
}
