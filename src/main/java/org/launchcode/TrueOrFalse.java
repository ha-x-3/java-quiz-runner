package org.launchcode;

public class TrueOrFalse extends Question{

    private final String question;
    private final String answer;
    private Boolean isCorrect;

    public String ask() {
        return "True or False \n" + this.question;
    }

    public void record(String userAnswer) {
        if(userAnswer.equals(answer)) {
            this.setIsCorrect(true);
        } else {
            this.setIsCorrect(false);
        }
    }

    private void setIsCorrect(Boolean possibleCorrect) {
        isCorrect = possibleCorrect;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public TrueOrFalse(String anAnswer, String aQuestion) {
        answer = anAnswer;
        question = aQuestion;
    }

}
