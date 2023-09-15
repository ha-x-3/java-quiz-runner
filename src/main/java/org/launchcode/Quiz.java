package org.launchcode;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> theQuestions = new ArrayList<>();
    private String name;
    private Integer totalCorrect = 0;
    Quiz(String aName) {
        name = aName;
    }

    public Integer getTotalQuestions() {
        return this.theQuestions.size();
    }

    public String getGrade() {
        return this.totalCorrect + "/" + this.getTotalQuestions();
    }

    private void incrementTotalCorrect() {
        this.totalCorrect++;
    }

    public void addMC(String aQuestion, String anAnswer, String aPossibleAnswers) {
        Question q = new MultipleChoice(aQuestion, anAnswer, aPossibleAnswers);
        this.theQuestions.add(q);
    }

    public void addCheckBox(String aQuestion, String answers, String aCorrectAnswers) {
        Question q = new Checkbox(aQuestion, answers, aCorrectAnswers);
        this.theQuestions.add(q);
    }

    public void addTF(String anAnswer, String aQuestion) {
       Question q = new TrueOrFalse(anAnswer, aQuestion);
       this.theQuestions.add(q);
    }

    public String gradeQ(Boolean isCorrect) {
        if (isCorrect) {
            this.incrementTotalCorrect();
            return "You are correct!\n";
        }
        return "Sorry! That's incorrect!\n";
    }

    public ArrayList<Question> getTheQuestions() {
        return theQuestions;
    }
}
