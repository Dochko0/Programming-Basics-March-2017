package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double counterTwo = 0.0;
        double counterThree = 0.0;
        double counterFour = 0.0;

        for (int i = 0; i < num; i++) {
            int checkNumber = Integer.parseInt(scanner.nextLine());

            if (checkNumber % 2 == 0) {
                counterTwo++;
            } if (checkNumber % 3 == 0) {
                counterThree++;
            } if (checkNumber % 4 == 0) {
                counterFour++;
            }
        }
        double twoPer = (counterTwo / num) * 100;
        double threePer = (counterThree / num) * 100;
        double fourPer = (counterFour / num) * 100;

        System.out.printf("%.2f%%\n",twoPer);
        System.out.printf("%.2f%%\n",threePer);
        System.out.printf("%.2f%%\n",fourPer);
    }
}
