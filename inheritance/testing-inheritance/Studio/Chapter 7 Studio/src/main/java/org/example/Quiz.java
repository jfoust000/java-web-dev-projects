package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class Quiz {

    private ArrayList<Question> questions;
    private double totalCorrectAnswers = 0;
    private double grade = 0;
    public Quiz(ArrayList<Question> questions) {

        this.questions = questions;

    }

    public void addQuestion(Question question) {

        this.questions.add(question);

    }

    public String gradeQuiz() {

        DecimalFormat df = new DecimalFormat("#.00");

        this.grade = this.totalCorrectAnswers / questions.size() * 100;

        return df.format(grade);
    }

    public void runQuiz() {

        System.out.println("The quiz has started\n");
        Scanner input = new Scanner(System.in);
        String userAnswer = "";

        for (Question question : questions) {

            System.out.println(question.getText());


        }

    }

}
