package org.example;

import java.util.Objects;

public class Question {

    private int number;
    private String text;
    private String answer;

    public Question(int num, String text, String answer) {

        this.number = num;
        this.text = text;
        this.answer = answer;

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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String questionAnswer) {
        this.answer = questionAnswer;
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
