package com.company;

import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class leftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftsum = 0;
        int rightSum = 0;
        int num = 0;

        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(scanner.nextLine());
            leftsum = leftsum + num;
        }
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + num;
        }
        if (leftsum == rightSum) {
            System.out.println("Yes, sum =" + leftsum);
        } else {
            int diff = Math.abs(leftsum - rightSum);
            System.out.println("No, diff = " + diff);
        }
    }
}
