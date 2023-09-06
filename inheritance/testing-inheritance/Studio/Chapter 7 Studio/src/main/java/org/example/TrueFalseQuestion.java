package org.example;

import java.util.ArrayList;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(int num, String text, ArrayList<String> possibleAnswers, String correctAnswer) {

        super(num, text, possibleAnswers, correctAnswer);

    }

    public void printPossibleAnswers() {

        System.out.println("Choose True or False:\n");

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
