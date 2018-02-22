package com.company;

import java.util.Scanner;

/**
 * Created by User on 3.5.2017 г..
 */
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        double underThree = 0.0;
        double underFour = 0.0;
        double underFive = 0.0;
        double aboveFive = 0.0;
        double counter = 0.0;
        double counterThree=0.0;
        double counterFour=0.0;
        double counterFive=0.0;
        double couterAboveFive = 0.0;


        for (int i = 1; i <= students; i++) {
            double evaluation = Double.parseDouble(scanner.nextLine());

            if (evaluation < 3) {
                underThree+=evaluation;
                counterThree++;
            } else if (evaluation >= 3 && evaluation < 4) {
                underFour+=evaluation;
                counterFour++;
            } else if (evaluation >= 4 && evaluation < 5) {
                underFive+=evaluation;
                counterFive++;
            } else if (evaluation >= 5) {
                aboveFive+=evaluation;
                couterAboveFive++;
            }
            counter++;
        }
        double midleEvaluation = (underThree+underFour+underFive+aboveFive)/counter;

        double percentThree = (counterThree/counter)*100;
        double percentFour = (counterFour/counter)*100;
        double percentFive = (counterFive/counter)*100;
        double percentAboveFive = (couterAboveFive/counter)*100;

        System.out.printf("Top students: %.2f%%\n", percentAboveFive);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", percentFive);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", percentFour);
        System.out.printf("Fail: %.2f%%\n", percentThree);
        System.out.printf("Average: %.2f\n", midleEvaluation);
    }
}
