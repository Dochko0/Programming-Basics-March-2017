package com.company;

import java.util.Scanner;

/**
 * Created by User on 23.4.2017 г..
 */
public class ninethJudge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String firstRowStars = newString("*", 2 * n);
        String firstRowSpaces = newString(" ", n);
        String firstAndLastRow = firstRowStars + firstRowSpaces + firstRowStars;

        for (int r = 1; r <= n; r++) {
            String slashes = newString("/", n * 2 - 2);
            //if (r == (n-1)/2-1) {
            if (r == (n / 2) + n % 2) {
                String pipes = newString("|", n);
                System.out.println("*" + slashes + "*" + pipes + "*" + slashes + "*");
            } else if (r == 1 || r == n) {
                System.out.println(firstAndLastRow);
            } else {
                System.out.println("*" + slashes + "*" + firstRowSpaces + "*" + slashes + "*");
            }


        }
    }

    public static String newString(String text, int repeatCount) {
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {
            a.append(text);
        }
        return a.toString();
    }
}
