package com.company;

import java.util.Scanner;

/**
 * Created by User on 5.5.2017 г..
 */
public class Styrofoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double areaHouse = Double.parseDouble(scanner.nextLine());
        double window = Double.parseDouble(scanner.nextLine());
        double epsPack = Double.parseDouble(scanner.nextLine());
        double priceEpsPack = Double.parseDouble(scanner.nextLine());

        double clearArea = (areaHouse - window * 2.4) * 1.1;
        double packs = Math.ceil(clearArea / epsPack);
        double price = packs * priceEpsPack;
        double difference = 0.0;

        if (budget >= price) {
            difference = budget - price;

            System.out.printf("Spent: %.2f\n", price);
            System.out.printf("Left: %.2f", difference);
        } else {
            difference = price - budget;
            System.out.printf("Need more: %.2f", difference);
        }
    }
}
