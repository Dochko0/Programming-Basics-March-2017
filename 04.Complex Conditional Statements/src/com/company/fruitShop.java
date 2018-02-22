package com.company;

import java.util.Scanner;

/**
 * Created by User on 22.3.2017 г..
 */
public class fruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitToBuy = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        //String fruits = "banana  apple  orange  grapefruit  kiwi  pineapple  grapes";
        String workingDay = "Monday Tuesday Wednesday Thursday Friday";
        String weekend = "Saturday Sunday";
        double price = 0.0;

        if (workingDay.contains(day)) {
            switch (fruitToBuy) {
                case "banana":
                    price = quantity * 2.5;
                    System.out.println(price);
                    break;
                case "apple":
                    price = quantity * 1.2;
                    System.out.println(price);
                    break;
                case "orange":
                    price = quantity * 0.85;
                    System.out.println(price);
                    break;
                case "grapefruit":
                    price = quantity * 1.45;
                    System.out.println(price);
                    break;
                case "kiwi":
                    price = quantity * 2.7;
                    System.out.println(price);
                    break;
                case "pineapple":
                    price = quantity * 5.5;
                    System.out.println(price);
                    break;
                case "grapes":
                    price = quantity * 3.85;
                    System.out.println(price);
                    break;
                default:
                    System.out.println("error");
            }
        }
        else if (weekend.contains(day)) {
            switch (fruitToBuy) {
                case "banana":
                    price = quantity * 2.7;
                    System.out.println(price);
                    break;
                case "apple":
                    price = quantity * 1.25;
                    System.out.println(price);
                    break;
                case "orange":
                    price = quantity * 0.90;
                    System.out.println(price);
                    break;
                case "grapefruit":
                    price = quantity * 1.60;
                    System.out.println(price);
                    break;
                case "kiwi":
                    price = quantity * 3.0;
                    System.out.println(price);
                    break;
                case "pineapple":
                    price = quantity * 5.6;
                    System.out.println(price);
                    break;
                case "grapes":
                    price = quantity * 4.2;
                    System.out.println(price);
                    break;
                default:
                    System.out.println("error");
            }
        }else{
            System.out.println("error");
        }
    }
}
