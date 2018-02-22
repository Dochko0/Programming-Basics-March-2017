package com.company;

import java.util.Scanner;

/**
 * Created by User on 28.3.2017 г..
 */
public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;

        if (budget <= 100) {
            if (season.equals("summer")) {
                price = budget * 0.3;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", price);
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", price);
            }
        } else if (budget > 100 && budget <= 1000) {
            if (season.equals("summer")) {
                price = budget * 0.4;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f", price);
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f", price);
            }
        } else if (budget > 1000) {
            price = budget *0.9;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", price);
        }
    }
}
