package test;

import main.java.Element;
import main.java.Paper;
import main.java.Rock;

public class TestElements {

    public static void main(String args[]) {
        Element rock = new Rock("Rock");
        Element paper = new Paper("Paper");
        System.out.println(rock.compareTo(paper));
        System.out.println(paper.compareTo(rock));
        System.out.println(rock.compareTo(rock));
    }
}
