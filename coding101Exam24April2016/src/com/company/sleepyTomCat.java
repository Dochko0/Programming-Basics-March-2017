package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class sleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());

        int workDays = 365-restDays;

        int restDaysMin = restDays*127;
        int workDaysMin = workDays*63;

        if (restDaysMin+workDaysMin<30000){
            int lessForPlay = 30000-(restDaysMin+workDaysMin);
            int min = lessForPlay%60;
            double hours = Math.floor(lessForPlay/60);

            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %d minutes less for play", hours , min);

        }else {
            int lessForSleep = (restDaysMin+workDaysMin)-30000;
            int min = lessForSleep%60;
            double hours = Math.floor(lessForSleep/60);

            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %d minutes more for play", hours , min);
        }


    }
}
