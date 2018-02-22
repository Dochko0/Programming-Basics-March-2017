package com.company;

import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesNew = minutes + 15;

        int over60 = minutesNew % 60;
        int hoursPlus = (int) Math.floor(minutesNew / 60);

        if (minutesNew > 60) {
            hours += hoursPlus;
        }
        if (minutesNew == 60) {
            hours += 1;
        }
        int over24 = hours % 24;


        if (over60 < 10) {
            System.out.printf("%d:0%d", over24, over60);
        } else {
            System.out.printf("%d:%d", over24, over60);
        }
    }
}
