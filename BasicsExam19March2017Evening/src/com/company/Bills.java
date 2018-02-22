package com.company;

import java.util.Scanner;

/**
 * Created by User on 5.5.2017 г..
 */
public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = Integer.parseInt(scanner.nextLine());
        double electricity= 0.0;
        double water = 0.0;
        double internet = 0.0;
        double other = 0.0;
        double counter = 0.0;

        for (int i = 0; i < month; i++) {
            double billEl = Double.parseDouble(scanner.nextLine());
            electricity+=billEl;
            other = (billEl+20+15)*1.2+other;
            counter++;
        }

        water=month*20;
        internet = month*15;

        double average = (electricity+water+internet+other)/month;

        System.out.printf("Electricity: %.2f lv\n", electricity);
        System.out.printf("Water: %.2f lv\n", water);
        System.out.printf("Internet: %.2f lv\n", internet);
        System.out.printf("Other: %.2f lv\n", other);
        System.out.printf("Average: %.2f lv", average);
    }
}
