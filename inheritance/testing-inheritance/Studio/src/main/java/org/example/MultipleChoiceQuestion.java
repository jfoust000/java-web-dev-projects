package org.example;
import java.util.ArrayList;
public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(int num, String text, ArrayList<String> possibleAnswers, String correctAnswer) {

        super(num, text, possibleAnswers, correctAnswer);

    }

    public void printPossibleAnswers() {

        System.out.println("Select One Answer:\n");

        for (String answer : getPossibleAnswers()) {

            System.out.println(answer);

        }

    }


}
