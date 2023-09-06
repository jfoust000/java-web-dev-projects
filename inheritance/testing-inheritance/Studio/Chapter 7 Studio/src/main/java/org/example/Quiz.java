package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Quiz {

    private ArrayList<Question> questions;
    private ArrayList<String> userAnswers;
    private double totalCorrectAnswers = 0;
    private double grade = 0;
    public Quiz(ArrayList<Question> questions) {

        this.questions = questions;

    }

    public void addQuestion(Question question) {

        this.questions.add(question);

    }

    private String gradeQuiz() {

        DecimalFormat df = new DecimalFormat("#.00");

        this.grade = this.totalCorrectAnswers / questions.size() * 100;

        return df.format(grade);
    }

    public void runQuiz() {

        System.out.println("The quiz has started\n");
        Scanner input = new Scanner(System.in);
        String userAnswer = "";

        for (Question question : questions) {

            System.out.println(question.toString());

            question.printPossibleAnswers();

            if (question instanceof CheckboxQuestion) {

                System.out.print("Enter choices separated by a comma - no spaces and hit Enter: ");

            } else {

                System.out.print("Enter your choice and hit Enter: ");

            }

            userAnswer = input.nextLine();
            userAnswers.add(userAnswer);

            if (question.isCorrectAnswer(userAnswer)) {

                this.totalCorrectAnswers += 1;

            }

        }

        System.out.println("Results:\n");

        for (Question question : questions) {

            for (String answer : userAnswers) {

                System.out.println(question.toString());
                System.out.println("Your Answer: " + answer + "\n");
                System.out.println("Correct Answer: " + question.getCorrectAnswer() + "\n");

            }

        }
        System.out.println("Overall grade: " + gradeQuiz()
                + totalCorrectAnswers + " out of "
                + questions.size() + " responses correct");

    }

}
