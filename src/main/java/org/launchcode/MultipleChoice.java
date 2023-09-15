package org.launchcode;

public class MultipleChoice extends Question {

    private String question;
    private String answer;
    private Boolean isCorrect;
    private String possibleAnswers;

    public String ask() {
        return this.question + "\n" + this.possibleAnswers;
    }

    public void record(String userAnswer) {
        if (userAnswer.equals(this.getAnswer())) {
            this.setIsCorrect(true);
        } else {
            this.setIsCorrect(false);
        }
    }

    private void setIsCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public Boolean getIsCorrect() {
        return  isCorrect;
    }

    public String getAnswer() {
        return this.answer;
    }

    public MultipleChoice(String aQuestion, String anAnswer, String aPossibleAnswers) {
        question = aQuestion;
        answer = anAnswer;
        possibleAnswers = aPossibleAnswers;
    }

}