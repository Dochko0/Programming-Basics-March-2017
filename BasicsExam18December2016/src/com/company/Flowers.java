package com.company;

import java.util.Scanner;

/**
 * Created by User on 2.5.2017 г..
 */
public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hrizantemi = Double.parseDouble(scanner.nextLine());
        double rose = Double.parseDouble(scanner.nextLine());
        double lale = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double sumHrizantemi = 0.0;
        double sumRose = 0.0;
        double sumLale = 0.0;

        double cenaHrizantema = 0.0;
        double cenaRose = 0.0;
        double cenaLale = 0.0;
        double sum = 0;

        if (season.equals("Spring") || season.equals("Summer")) {

            cenaHrizantema = 2.0;
            cenaRose = 4.1;
            cenaLale = 2.5;

            if (holiday.equals("Y")) {
                cenaHrizantema = cenaHrizantema * 1.15;
                cenaRose = cenaRose * 1.15;
                cenaLale = cenaLale * 1.15;
            }

            sumHrizantemi = hrizantemi * cenaHrizantema;
            sumRose = rose * cenaRose;
            sumLale = lale * cenaLale;

            sum = sumHrizantemi+sumRose+sumLale;

            if (season.equals("Spring") && lale > 7) {
                sum = sum * 0.95;
            }
        } else if (season.equals("Autumn") || season.equals("Winter")) {

            cenaHrizantema = 3.75;
            cenaRose = 4.50;
            cenaLale = 4.15;

            if (holiday.equals("Y")) {
                cenaHrizantema = cenaHrizantema * 1.15;
                cenaRose = cenaRose * 1.15;
                cenaLale = cenaLale * 1.15;
            }

            sumHrizantemi = hrizantemi * cenaHrizantema;
            sumRose = rose * cenaRose;
            sumLale = lale * cenaLale;

            sum = sumHrizantemi+sumRose+sumLale;

            if (season.equals("Winter") && rose >= 10) {
                sum = sum * 0.90;
            }
        }

        if (hrizantemi + rose + lale > 20) {
            sum = sum * 0.8;
        }

        System.out.printf("%.2f", sum+2);
    }
}
