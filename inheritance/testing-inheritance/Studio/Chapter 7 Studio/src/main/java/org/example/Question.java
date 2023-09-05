package org.example;

import java.util.Objects;
import java.util.ArrayList;

public class Question {

    private int number;
    private String text;
    private ArrayList<String> answer;

    private boolean multipleAnswers;

    public Question(int num, String text, ArrayList<String> answer, boolean multipleAnswers) {

        this.number = num;
        this.text = text;
        this.answer = answer;
        this.multipleAnswers = multipleAnswers;

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

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> questionAnswer) {
        this.answer = questionAnswer;
    }


    public boolean isMultipleAnswers() {
        return multipleAnswers;
    }

    public void setMultipleAnswers(boolean multipleAnswers) {
        this.multipleAnswers = multipleAnswers;
    }

    @Override
    public String toString() {
        return "\nQuestion " + this.number + ":\n\n"
                + text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question question)) return false;
        return Objects.equals(getText(), question.getText()) && Objects.equals(getAnswer(), question.getAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText(), getAnswer());
    }

}
