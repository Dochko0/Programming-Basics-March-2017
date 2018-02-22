package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by User on 22.3.2017 г..
 */
public class smallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat format = new DecimalFormat("#.##########");



        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.50;
                    System.out.printf("%s", format.format(price));
                    break;
                case "water":
                    price = quantity * 0.80;
                    System.out.printf("%s", format.format(price));
                    break;
                case "beer":
                    price = quantity * 1.20;
                    System.out.printf("%s", format.format(price));
                    break;
                case "sweets":
                    price = quantity * 1.45;
                    System.out.printf("%s", format.format(price));
                    break;
                case "peanuts":
                    price = quantity * 1.60;
                    System.out.printf("%s", format.format(price));
                    break;
            }
        } else if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.40;
                    System.out.printf("%s", format.format(price));
                    break;
                case "water":
                    price = quantity * 0.70;
                    System.out.printf("%s", format.format(price));
                    break;
                case "beer":
                    price = quantity * 1.15;
                    System.out.printf("%s", format.format(price));
                    break;
                case "sweets":
                    price = quantity * 1.30;
                    System.out.printf("%s", format.format(price));
                    break;
                case "peanuts":
                    price = quantity * 1.50;
                    System.out.printf("%s", format.format(price));
                    break;
            }
        }
        else if (city.equals("Varna")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.45;
                    System.out.printf("%s", format.format(price));
                    break;
                case "water":
                    price = quantity * 0.70;
                    System.out.printf("%s", format.format(price));
                    break;
                case "beer":
                    price = quantity * 1.10;
                    System.out.printf("%s", format.format(price));
                    break;
                case "sweets":
                    price = quantity * 1.35;
                    System.out.printf("%s", format.format(price));
                    break;
                case "peanuts":
                    price = quantity * 1.55;
                    System.out.printf("%s", format.format(price));
                    break;
            }
        }
    }
}
