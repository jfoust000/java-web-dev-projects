package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Quiz {

    private ArrayList<Question> questions;
    private ArrayList<String> userAnswers = new ArrayList<>();
    private double totalCorrectAnswers = 0;
    public Quiz(ArrayList<Question> questions) {

        this.questions = questions;

    }

    public void addQuestion(Question question) {

        for (Question q : questions) {

            if (q.equals(question)) {

                System.out.println("This question already exists.");

            } else {

                this.questions.add(question);

            }

        }


    }

    private String gradeQuiz() {

        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(totalCorrectAnswers / questions.size() * 100);

    }

    public void runQuiz() {

        System.out.println("\nThe quiz has started");
        Scanner input = new Scanner(System.in);
        String userAnswer;

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

        System.out.println("\n\nResults:\n");

        for (int i = 0; i < questions.size(); i++) {

                System.out.println(questions.get(i).toString());
                System.out.println("Your Answer: " + userAnswers.get(i) + "\n");
                System.out.println("Correct Answer: " + questions.get(i).getCorrectAnswer() + "\n");

        }

        System.out.println("Overall grade: " + gradeQuiz()
                + "% " + (int) totalCorrectAnswers + " out of "
                + questions.size() + " responses correct");

    }

}
