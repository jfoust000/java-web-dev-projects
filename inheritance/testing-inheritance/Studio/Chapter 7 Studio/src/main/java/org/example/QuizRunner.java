package org.example;

import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args) {

        ArrayList<Question> quizQuestions = new ArrayList<>();

        String mcqText = "Which of these devices opens and closes?";
        ArrayList<String> multipleChoicePossibleAnswers = new ArrayList<>();
        multipleChoicePossibleAnswers.add("iPhone");
        multipleChoicePossibleAnswers.add("Desktop Computer");
        multipleChoicePossibleAnswers.add("Laptop");
        multipleChoicePossibleAnswers.add("iPad");
        String mcqCorrectAnswer = "Laptop";

        MultipleChoiceQuestion mcq = new MultipleChoiceQuestion(1,mcqText,
                multipleChoicePossibleAnswers, mcqCorrectAnswer);

        quizQuestions.add(mcq);

        String cbqText = "Which of these devices permanently store data?";
        ArrayList<String> checkBoxPossibleAnswers = new ArrayList<>();
        checkBoxPossibleAnswers.add("Internal Memory");
        checkBoxPossibleAnswers.add("External Keyboard");
        checkBoxPossibleAnswers.add("External SSD");
        checkBoxPossibleAnswers.add("USB Flash Drive");
        String cbqCorrectAnswer = "External SSD,USB Flash Drive";

        CheckboxQuestion cbq = new CheckboxQuestion(2, cbqText, checkBoxPossibleAnswers, cbqCorrectAnswer);
        quizQuestions.add(cbq);

        String tfText = "All desktop computers support dual monitors.";
        ArrayList<String> trueFalsePossibleAnswers = new ArrayList<>();
        trueFalsePossibleAnswers.add("True");
        trueFalsePossibleAnswers.add("False");
        String tfCorrectAnswer = "False";

        TrueFalseQuestion tfq = new TrueFalseQuestion(3, tfText, trueFalsePossibleAnswers, tfCorrectAnswer);
        quizQuestions.add(tfq);

        Quiz techQuiz = new Quiz(quizQuestions);

        techQuiz.runQuiz();

    }

}
