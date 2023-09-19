package org.launchcode;

public class QuizRunner {

    //Create Quiz
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        String q1 = "What were the four main characters' names in the TV series \"Golden Girls\"?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Maude"),
                new Choice("Blanche", true),
                new Choice("Dorothy", true),
                new Choice("Fran"),
                new Choice("Sophia", true),
                new Choice("Ellen"),
                new Choice("Rose", true),
                new Choice("Estelle")
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "In a website browser, \\\"www\\\" stands for World Wide Web.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "Who was the first woman pilot to fly solo across the Atlantic?";
        Choice[] q3Choices = new Choice[] {
                new Choice("Bessie Coleman"),
                new Choice("Amelia Earhart", true),
                new Choice("Harriet Quimby"),
                new Choice("Eileen Collins")
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        String q4 = "The unicorn is the national animal of which country?";
        Choice[] q4Choices = new Choice[] {
                new Choice("Malta"),
                new Choice("Nauru"),
                new Choice("Scotland", true),
                new Choice("Liechtenstein")
        };
        MultipleChoice question4 = new MultipleChoice(q4, q4Choices);

        String q5 = "Dump, floater, and wipe are terms used in volleyball.";
        Choice[] q5Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };
        TrueOrFalse question5 = new TrueOrFalse(q5, q5Choices);

        String q6 = "This hair pattern in cats is seen in almost exclusively females: ";
        Choice[] q6Choices = new Choice[] {
                new Choice("Tortoiseshell"),
                new Choice("Tabby"),
                new Choice("Calico", true),
                new Choice("Pointed")
        };
        MultipleChoice question6 = new MultipleChoice(q6, q6Choices);

        //Add questions to quiz
        quiz.addQuestions(new Question[] { question1, question2, question3, question4, question5, question6});

        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newline);

    }
}
