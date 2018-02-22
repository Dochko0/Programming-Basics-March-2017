package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.4.2017 г..
 */
public class softuniCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double groups = Double.parseDouble(scanner.nextLine());
        double autoStudents = 0;
        double microStudents = 0;
        double miniBusStudents = 0;
        double bigBusStudents = 0;
        double trainStudents = 0;
        double allStudents = 0;


        for (int i = 0; i < groups; i++) {
            double numStudents = Double.parseDouble(scanner.nextLine());

            if (numStudents <= 5) {
                autoStudents += numStudents;
            } else if (numStudents >= 6 && numStudents <= 12) {
                microStudents += numStudents;
            } else if (numStudents >= 13 && numStudents <= 25) {
                miniBusStudents += numStudents;
            } else if (numStudents >= 26 && numStudents <= 40) {
                bigBusStudents += numStudents;
            } else if (numStudents >=41 ) {
                trainStudents += numStudents;
            }
            allStudents += numStudents;
        }
        double auto = (autoStudents / allStudents) * 100;
        double micro = (microStudents / allStudents) * 100;
        double mini = (miniBusStudents / allStudents) * 100;
        double big = (bigBusStudents / allStudents) * 100;
        double train = (trainStudents / allStudents) * 100;

        System.out.printf("%.2f%%\n", auto);
        System.out.printf("%.2f%%\n", micro);
        System.out.printf("%.2f%%\n", mini);
        System.out.printf("%.2f%%\n", big);
        System.out.printf("%.2f%%\n", train);
    }
}
