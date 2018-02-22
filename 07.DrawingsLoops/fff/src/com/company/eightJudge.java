package com.company;

import java.util.Scanner;

/**
 * Created by User on 22.4.2017 г..
 */
public class eightJudge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int height = n + 1;
        System.out.println(newString(" ", n) + " | " + newString(" ", n));

        for (int i = 1; i <= n; i++) {
            String spaces = newString(" ", n - i);
            String stars = newString("*", i);
            System.out.printf("%s%s | %s%s\n",spaces, stars, stars, spaces);
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
