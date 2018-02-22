package com.company;

import java.util.Scanner;

/**
 * Created by User on 4.5.2017 г..
 */
public class SoftUniLogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < 2 * n; i++) {
            String dots = newString(".", 6 * n - i * 3 - 3);
            String hashTag = newString("#", 1 + 6 * i);

            System.out.println(dots + hashTag + dots);
        }

        for (int i = 0; i < n - 2; i++) {
            String leftDots = newString(".", 2 + i * 3);
            String centerHashTag = newString("#", 12 * n - 11 - 6 * i);
            String rightDots = newString(".", 3 + i * 3);

            System.out.println("|" + leftDots + centerHashTag + rightDots);
        }

        for (int i = 0; i < n; i++) {
            String leftDots = newString(".", 3 * n -4);
            String hash = newString("#", 6 * n + 1);
            String rightDots = newString(".", 3 * n-3);
            if (i < n - 1) {
                System.out.println("|" + leftDots + hash + rightDots);
            } else {
                System.out.println("@" + leftDots + hash + rightDots);
            }
        }
    }

    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
