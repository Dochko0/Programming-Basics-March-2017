package com.company;

import java.util.Scanner;

/**
 * Created by User on 30.3.2017 г..
 */
public class equalPairsTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int summary = 0;
        int afterSum = 0;
        int check = 0;
        int difference = 0;
        int difference2 = 0;
        int maxDifference = 0;
        int aftersum2 = 0;


        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        summary = num1 + num2;

        for (int i = 0; i < n - 1; i++) {

            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());
            afterSum = number1 + number2;

            if (afterSum == summary) {
                check++;
            } else {
                difference = Math.abs(afterSum - summary);
                if (i != 0) {
                    difference2 = Math.abs(afterSum - aftersum2);
                }
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
                if (difference2 > maxDifference) {
                    maxDifference = difference2;
                }
            }
            aftersum2 = afterSum;
        }
        if (check == (n - 1)) {
            System.out.println("Yes, value=" + summary);
        } else {
            System.out.println("No, maxdiff=" + maxDifference);
        }
    }
}