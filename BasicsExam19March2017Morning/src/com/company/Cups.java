package com.company;

import java.util.Scanner;

/**
 * Created by User on 4.5.2017 г..
 */
public class Cups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cups = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());
        double workDays = Double.parseDouble(scanner.nextLine());

        double allWorkHours = workDays*8*workers;
        double createdcups = Math.floor(allWorkHours/5);
        double difference = 0.0;

        if (createdcups>=cups){
            difference=(createdcups-cups)*4.2;
            System.out.printf("%.2f extra money", difference);
        }else {
            difference = (cups-createdcups)*4.2;
            System.out.printf("Losses: %.2f", difference);
        }
    }
}
