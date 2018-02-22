package com.company;

import java.util.Scanner;

/**
 * Created by User on 14.3.2017 г..
 */
public class VegetableMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vegetablePrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int weightVegetables = Integer.parseInt(scanner.nextLine());
        int weightFruits = Integer.parseInt(scanner.nextLine());

        double euroCurrency = 1.94;

        double sumForVegetables = vegetablePrice*weightVegetables;
        double sumForFruits = fruitPrice*weightFruits;

        double sum = ((sumForVegetables+sumForFruits)/euroCurrency);

        System.out.printf("%.7f" , sum);
    }
}
