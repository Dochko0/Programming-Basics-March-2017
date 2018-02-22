package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.4.2017 г..
 */
public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studio = 0.0;
        double apartament = 0.0;

        if (month.equals("May") || month.equals("October")) {
            if (nights > 7 && nights <= 14) {
                studio = (nights * 50) * 0.95;
                apartament = nights * 65;
            } else if (nights > 14) {
                studio = (nights * 50) * 0.7;
                apartament = (nights * 65) * 0.9;
            } else {
                studio = nights * 50;
                apartament = nights * 65;
            }
//            System.out.printf("Apartment: %.2f lv.\n", apartament);
//            System.out.printf("Studio: %.2f lv.\n", studio);

        } else if (month.equals("June") || month.equals("September")) {
            if (nights > 14) {
                studio = (nights * 75.2) * 0.8;
                apartament = (nights * 68.7) * 0.9;
            } else {
                studio = nights * 75.2;
                apartament = nights * 68.7;
            }
//            System.out.printf("Apartment: %.2f lv.\n" , apartament);
//            System.out.printf("Studio: %.2f lv.\n" , studio);

        } else if (month.equals("July") || month.equals("August")) {
            if (nights > 14) {
                studio = (nights * 76);
                apartament = (nights * 77) * 0.9;
            } else {
                studio = nights * 76;
                apartament = nights * 77;
            }
        }
        System.out.printf("Apartment: %.2f lv.\n", apartament);
        System.out.printf("Studio: %.2f lv.\n", studio);
    }
}
