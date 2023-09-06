package org.example;

import java.util.Objects;
import java.util.ArrayList;

public abstract class Question {

    private int number;
    private String text;
    private ArrayList<String> possibleAnswers;
    private String correctAnswer;

    public Question(int num, String text, ArrayList<String> possibleAnswers, String correctAnswer) {

        this.number = num;
        this.text = text;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int questionNumber) {
        this.number = questionNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String questionText) {
        this.text = questionText;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> questionAnswers) {
        this.possibleAnswers = questionAnswers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public abstract void printPossibleAnswers();

    public abstract boolean isCorrectAnswer();

    @Override
    public String toString() {
        return "\nQuestion " + this.number + ".)\n\n"
                + text + "\n\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question question)) return false;
        return Objects.equals(getText(), question.getText()) && Objects.equals(getCorrectAnswer(), question.getCorrectAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText(), getCorrectAnswer());
    }

}
