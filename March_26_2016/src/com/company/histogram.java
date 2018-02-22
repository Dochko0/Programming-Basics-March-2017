package com.company;

import java.util.Scanner;

/**
 * Created by User on 30.3.2017 г..
 */
public class histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int underTwo = 0;
        int betweenTwoAndFour = 0;
        int bFourAndSix = 0;
        int betweenSixandEight = 0;
        int maximum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 1 && num < 200) {
                underTwo++;
            } else if (num >= 200 && num < 400) {
                betweenTwoAndFour++;
            } else if (num >= 400 && num < 600) {
                bFourAndSix++;
            } else if (num >= 600 && num < 800) {
                betweenSixandEight++;
            } else if (num >= 800) {
                maximum++;
            }
        }

        double m = n;
        double perUndetTwo = (underTwo / m)*100;
        double perBetweenTwoAndFour = (betweenTwoAndFour / m) * 100;
        double perBetweenFourAndSix = (bFourAndSix / m) * 100;
        double perBetweenSixAndEight = (betweenSixandEight / m) * 100;
        double perMaximum = (maximum / m) * 100;

        System.out.printf("%.2f%%\n", perUndetTwo);
        System.out.printf("%.2f%%\n", perBetweenTwoAndFour);
        System.out.printf("%.2f%%\n", perBetweenFourAndSix);
        System.out.printf("%.2f%%\n", perBetweenSixAndEight);
        System.out.printf("%.2f%%\n", perMaximum);
    }
}
