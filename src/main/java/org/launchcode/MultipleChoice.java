package org.launchcode;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    ArrayList<String> answers = new ArrayList<>();

    public MultipleChoice(String question, String correctAnswer, ArrayList<String> answers) {
        super(question, correctAnswer);
        this.answers = answers;
    }

//    @Override
//    public String toString() {
//
//        String str;
//
//        for (String a : answers) {
//
//        }
//
//        return getQuestion() + System.lineSeparator() +
//                getCorrectAnswer().join(",") +
//                answers;
//    }


    @Override
    public String toString() {
        return super.toString();
    }
}