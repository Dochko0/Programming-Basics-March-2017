package com.company;

import java.util.Scanner;

/**
 * Created by User on 7.5.2017 г..
 */
public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTravel = Double.parseDouble(scanner.nextLine());
        double puzzles = Double.parseDouble(scanner.nextLine());
        double talkingKikli = Double.parseDouble(scanner.nextLine());
        double bears = Double.parseDouble(scanner.nextLine());
        double minions = Double.parseDouble(scanner.nextLine());
        double trucks = Double.parseDouble(scanner.nextLine());

        double sumToys = puzzles + talkingKikli + bears + minions + trucks;
        double pechalba = puzzles * 2.6 + talkingKikli * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;
        double difference = 0.0;

        if (sumToys >= 50) {
            pechalba = (pechalba * 75) / 100;
        }
        pechalba = (pechalba * 90) / 100;

        if (pechalba >= priceTravel) {
            difference = pechalba - priceTravel;
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            difference = priceTravel - pechalba;
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }
    }
}
