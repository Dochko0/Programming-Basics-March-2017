package com.company;

import java.util.Scanner;

/**
 * Created by User on 19.3.2017 г..
 */
public class bonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (number <= 100) {
            bonus += 5;
        }
        if (number > 100 && number <= 1000) {
            bonus += (0.2 * number);
        }
        if (number > 1000) {
            bonus += (0.1 * number);
        }
        if (number % 2 == 0) {
            bonus += 1;
        }
        if (number % 10 == 5) {
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}

