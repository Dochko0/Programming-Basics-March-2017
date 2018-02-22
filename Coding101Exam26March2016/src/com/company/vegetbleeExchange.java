package com.company;

import java.util.Scanner;

public class vegetbleeExchange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int vegetablesWeight = Integer.parseInt(scanner.nextLine());
        int friutsWeight = Integer.parseInt(scanner.nextLine());

        double vegetables = priceVegetables * vegetablesWeight;
        double fruits = priceFruits * friutsWeight;

        double sum = (vegetables + fruits)/1.94;

        System.out.printf("%.7f", sum);
    }
}
