package com.company;

import java.util.Scanner;

/**
 * Created by User on 25.4.2017 г..
 */
public class travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double spendMoney = 0.00;
        String bulgaria = "Bulgaria";
        String balkans = "Balkans";
        String eu = "Europe";


        if (money <= 100) {
            if (season.equals("summer")) {
                spendMoney = money * 0.3;
                System.out.printf("Somewhere in %s\n", bulgaria);
                System.out.printf("Camp - %.2f", spendMoney);
            } else {
                spendMoney = money * 0.7;
                System.out.printf("Somewhere in %s\n", bulgaria);
                System.out.printf("Hotel - %.2f", spendMoney);
            }
        } else if (money > 100 && money <= 1000) {
            if (season.equals("summer")) {
                spendMoney = money * 0.4;
                System.out.printf("Somewhere in %s\n", balkans);
                System.out.printf("Camp - %.2f", spendMoney);
            } else {
                spendMoney = money * 0.8;
                System.out.printf("Somewhere in %s\n", balkans);
                System.out.printf("Hotel - %.2f", spendMoney);
            }
        } else if (money > 1000) {
            spendMoney = money * 0.9;
            System.out.printf("Somewhere in %s\n", eu);
            System.out.printf("Hotel - %.2f", spendMoney);
        }
    }
}
