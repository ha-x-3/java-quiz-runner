package org.launchcode;

import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {

        Quiz quiz = new Quiz("quiz");
        quiz.addTF("True", "In a website browser, \"www\" stands for World Wide Web.");
        quiz.addMC("Who was the first woman pilot to fly solo across the Atlantic?", "B", "\tA. Bessie Coleman \n" +
                "    B. Amelia Earhart\n" +
                "    C. Harriet Quimby\n" +
                "    D. Eileen Collins");
        quiz.addCheckBox("What were the four main characters' names in the TV series \"Golden Girls\"?", "\t1. Maude\n" +
                "    2. Blanche\n" +
                "    3. Dorothy\n" +
                "    4. Fran\n" +
                "    5. Sophia\n" +
                "    6. Ellen\n" +
                "    7. Rose\n" +
                "    8. Estelle", "2,3,5,7");
        quiz.addTF("True", "Dump, floater, and wipe are terms used in volleyball.");
        quiz.addMC("The unicorn is the national animal of which country?", "C", "\tA. Malta\n" +
                "    B. Nauru\n" +
                "    C. Scotland\n" +
                "    D. Liechtenstein");
        Scanner input = new Scanner(System.in);
        String answer;
        for (int i = 0; i < quiz.getTotalQuestions(); i++) {
            System.out.println(quiz.theQuestions.get(i).ask());
            answer = input.nextLine();
            quiz.theQuestions.get(i).record(answer);
            System.out.println(quiz.gradeQ(quiz.theQuestions.get(i).getIsCorrect()));
        }
        System.out.println(quiz.getGrade());
    }
}
