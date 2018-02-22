package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.4.2017 г..
 */
public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double daysNum = Double.parseDouble(scanner.nextLine());
        double foodKilos = Double.parseDouble(scanner.nextLine());
        double dogForDays = Double.parseDouble(scanner.nextLine());
        double catForDays = Double.parseDouble(scanner.nextLine());
        double turtleForDays = Double.parseDouble(scanner.nextLine());

        double needFood = (dogForDays + catForDays + (turtleForDays/1000)) * daysNum;

        if (foodKilos >= needFood) {
            double left = foodKilos - needFood;
            int leftT= (int)Math.floor(left);

            System.out.printf("%d kilos of food left.", leftT);

        } else {
            double need = needFood - foodKilos;
            int needT= (int)Math.ceil(need);
            System.out.printf("%d more kilos of food are needed.", needT);
        }
    }
}
