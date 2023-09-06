package org.example;

import java.util.ArrayList;

public class CheckboxQuestion extends Question{

    public CheckboxQuestion(int num, String text, ArrayList<String> possibleAnswers, String correctAnswer) {

        super(num, text, possibleAnswers, correctAnswer);

    }

    public void printPossibleAnswers() {

        System.out.println("Choose all that apply:\n");

        for (String answer : getPossibleAnswers())

            System.out.println(answer);

    }

    public boolean isCorrectAnswer() {

        boolean isCorrect = false;

        for (String possibleAnswer : getPossibleAnswers()) {

            isCorrect = getCorrectAnswer().equals(possibleAnswer);

        }

        return isCorrect;

    }

}
