package org.launchcode;

public abstract class Question {

    public abstract String ask();
    public abstract void record(String userAnswer);

    public abstract Boolean getIsCorrect();

}
