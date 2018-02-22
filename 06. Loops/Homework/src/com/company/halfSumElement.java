package com.company;

import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class halfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;

            if (num > max) {
                max = num;
            }
        }
        sum = sum - max;
        int diff = Math.abs(sum - max);
        if (diff == 0) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
