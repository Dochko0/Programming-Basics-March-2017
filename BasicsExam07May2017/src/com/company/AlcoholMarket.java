package com.company;

import java.util.Scanner;

public class AlcoholMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceUiski = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double vine = Double.parseDouble(scanner.nextLine());
        double rakia = Double.parseDouble(scanner.nextLine());
        double uiski = Double.parseDouble(scanner.nextLine());

        double priceRakia = priceUiski/2.0;
        double priceVine = (priceRakia*60)/100;
        double priceBeer = (priceRakia*20)/100;

        double sum = priceUiski*uiski+priceBeer*beer+priceVine*vine+priceRakia*rakia;

        System.out.printf("%.2f", sum);


    }
}
