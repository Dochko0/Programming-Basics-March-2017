package com.company;

import java.util.Scanner;

/**
 * Created by User on 4.5.2017 г..
 */
public class WorkHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needHH = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());
        double daysForWork = Double.parseDouble(scanner.nextLine());

        double hoursForWork = (daysForWork*8)*workers;

        if (hoursForWork>=needHH){
            double difference = hoursForWork-needHH;
            System.out.printf("%.0f hours left" , difference);
        }else {
            double otherDifference = needHH-hoursForWork;
            double neustoika = daysForWork*otherDifference;
            System.out.printf("%.0f overtime\n" , otherDifference);
            System.out.printf("Penalties: %.0f", neustoika);
        }
    }
}
