package com.company;

import java.util.Scanner;

/**
 * Created by User on 4.5.2017 г..
 */
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            for (int j = firstNum; j <= secondNum; j++) {
                counter++;
                sum = i + j;
                if (sum == magicNum) {
                    System.out.print("Combination N:" + counter);
                    System.out.printf(" (%d + %d = %d)", i, j, sum);
                    break;
                }
                if (i==secondNum && j==secondNum) {
                    System.out.println(counter + " combinations - neither equals " + magicNum);
                }
            }
            if (sum == magicNum) {
                break;
            }
        }
    }
}
