package com.company;

import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class oddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumOdd = sumOdd + num;
            } else {
                sumEven = sumEven + num;
            }
        }
        if (sumOdd == sumEven) {
            System.out.printf("Yes\nSum = " + sumEven);
        } else {
            int diff = Math.abs(sumEven - sumOdd);
            System.out.println("No\nDiff = " + diff);
        }
    }
}
