package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Questions {


    public static ArrayList<String> questions = new ArrayList<>(Arrays.asList(
            "Hello", //index 0
            "What is your name?",
            "would you like to buy a car today?",
            "Great, let's take a look at our inventory", //index 3
            "I understand, would you still like to take a look at our inventory?",
            "no problem, would you like to see our used inventory?"));

    public static ArrayList<String> statements = new ArrayList<>(Arrays.asList(
            "Alrighty, you have a nice day. If you have any questions, here is my number",
            "These are the brands we currently have in stock.",//index 1
            "Great, let's go take a look.",
            "Have a nice day!"));// index 3


    static {
        questions.add("which brand do you like?");//index 6
        questions.add("which car do you like, Car 1 or 2?");//index 7
        questions.add("would you like to buy it?");//index 8
        statements.add("This is what we have in stock: ");//index 4
        statements.add("great, let's go sign some papers");//index 5
        statements.add("I understand, feel free to look around and ask me any \n" +
                "questions. I'll be in my office around the corner.");//index 6

    }

}// end class
