package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.4.2017 г..
 */
public class firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int needHours = Integer.parseInt(scanner.nextLine());
        int dayForFirm = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double workHours = (dayForFirm * 0.9 * 8);
        double overtime = workers * 2 * dayForFirm;
        double allHours = Math.floor(workHours + overtime);

        if (needHours <= allHours) {
            int leftHours = (int) allHours - needHours;
            System.out.printf("Yes!%d hours left.", leftHours);
        } else {
            int deficit = (int) (needHours - allHours);
            System.out.printf("Not enough time!%d hours needed.", deficit);
        }
    }
}
