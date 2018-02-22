package com.company;

import java.util.Scanner;

/**
 * Created by User on 28.4.2017 г..
 */
public class flowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double magnoliasQuantity = Double.parseDouble(scanner.nextLine());
        double hyacinthQuantity = Double.parseDouble(scanner.nextLine());
        double rosesQuantity = Double.parseDouble(scanner.nextLine());
        double cactusQuantity = Double.parseDouble(scanner.nextLine());
        double giftPrise = Double.parseDouble(scanner.nextLine());

        double profit = (magnoliasQuantity * 3.25 + hyacinthQuantity * 4 + rosesQuantity * 3.5 + cactusQuantity * 8) * 0.95;
        int margin = 0;

        if (profit >= giftPrise) {
            margin = (int) Math.floor(profit - giftPrise);
            System.out.printf("She is left with %d leva.", margin);
        } else {
            margin = (int) Math.ceil(giftPrise - profit);
            System.out.printf("She will have to borrow %d leva.", margin);
        }
    }
}
