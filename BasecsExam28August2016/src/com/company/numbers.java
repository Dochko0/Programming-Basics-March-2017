package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.4.2017 г..
 */
public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        int p = n;

        for (int i = 0; i < 3; i++) {
            m = p % 10;
            if (i == 0) {
                third = m;
            } else if (i == 1) {
                second = m;
            } else if (i == 2) {
                first = m;
            }

            p = p / 10;
        }
        int row = first + second;
        int column = first + third;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (n % 5 == 0) {
                    n = n - first;
                } else if (n % 3 == 0) {
                    n = n - second;
                } else {
                    n = n + third;
                }

                if (j == column - 1) {
                    System.out.printf("%d\n", n);
                } else {
                    System.out.printf("%d ", n);
                }
            }
        }
    }
}