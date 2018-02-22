package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class MatchTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        if (people >= 1 && people <= 4) {
            double moneyForTickets = budget * 0.25;

            if (category.equals("VIP")) {
                double ticketsPrice = 499.99 * people;
                if (moneyForTickets >= ticketsPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - ticketsPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - moneyForTickets);
                }
            } else if (category.equals("Normal")) {
                double ticketsPrice = 249.99 * people;
                if (moneyForTickets >= ticketsPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - ticketsPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - moneyForTickets);
                }
            }
        } else if (people >= 5 && people <= 9) {
            double moneyForTickets = budget * 0.40;

            if (category.equals("VIP")) {
                double ticketsPrice = 499.99 * people;
                if (moneyForTickets >= ticketsPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - ticketsPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - moneyForTickets);
                }
            } else if (category.equals("Normal")) {
                double ticketsPrice = 249.99 * people;
                if (moneyForTickets >= ticketsPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - ticketsPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - moneyForTickets);
                }
            }
        } else if (people >= 10 && people <= 24) {
            double moneyForTickets = budget * 0.50;

            if (category.equals("VIP")) {
                double ticketsPrice = 499.99 * people;
                if (moneyForTickets >= ticketsPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - ticketsPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - moneyForTickets);
                }
            } else if (category.equals("Normal")) {
                double ticketsPrice = 249.99 * people;
                if (moneyForTickets >= ticketsPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - ticketsPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - moneyForTickets);
                }
            }
        } else if (people >= 24 && people <= 49) {
            double moneyForTickets = budget * 0.60;

            if (category.equals("VIP")) {
                double ticketsPrice = 499.99 * people;
                if (moneyForTickets >= ticketsPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - ticketsPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - moneyForTickets);
                }
            } else if (category.equals("Normal")) {
                double ticketsPrice = 249.99 * people;
                if (moneyForTickets >= ticketsPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - ticketsPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - moneyForTickets);
                }
            }
        } else if (people >= 50) {
            double moneyForTickets = budget * 0.75;

            if (category.equals("VIP")) {
                double ticketsPrice = 499.99 * people;
                if (moneyForTickets >= ticketsPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - ticketsPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - moneyForTickets);
                }
            } else if (category.equals("Normal")) {
                double ticketsPrice = 249.99 * people;
                if (moneyForTickets >= ticketsPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", moneyForTickets - ticketsPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - moneyForTickets);
                }
            }
        }
    }
}
//16 mins