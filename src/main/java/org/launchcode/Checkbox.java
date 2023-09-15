package org.launchcode;

import java.util.Arrays;
import java.util.List;

public class Checkbox extends Question{

    String question;
    Boolean isCorrect;
    String[] possibleAnswers;
    String[] correctList;

    public Checkbox(String aQuestion, String answers, String aCorrectAnswers) {
        possibleAnswers = answers.split(",");
        question = aQuestion;
        correctList = aCorrectAnswers.split(",");
    }

    public String ask() {
        String askString = question + "\n" + "Please select all of the correct answers separated by a comma like so: 1,3,5 (No spaces!)";

        for (String possibleAnswer : possibleAnswers) {
            askString += "\n" + possibleAnswer;
        }
        return askString;
    }

    public void record(String userAnswer) {
        String[] userAnswers = userAnswer.split(",");
        List<String> iterAnswers;
        iterAnswers = Arrays.asList(userAnswers);
        List<String> iterCorrect = Arrays.asList(this.correctList);
        if(userAnswers.length != possibleAnswers.length) {
            this.setIsCorrect(false);
        }
        if(iterCorrect.containsAll(iterAnswers)) {
            this.setIsCorrect(true);
        }
    }

    private void setIsCorrect(Boolean corr) {
        isCorrect = corr;
    }

    public Boolean getIsCorrect() {
        return this.isCorrect;
    }

}
