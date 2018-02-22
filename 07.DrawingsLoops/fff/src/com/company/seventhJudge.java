package com.company;

import java.util.Scanner;

/**
 * Created by User on 20.4.2017 г..
 */
public class seventhJudge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int heightMax = 2*n - 1;
        int widthMax = 2*n -1;

        for (int i = 0; i < n; i++) {

            String spaces = newString(" ", (n-1)-i);
            System.out.println(spaces+"*" + newString(" *", i));

        }

        for (int i = n-1; i > 0; i--) {

            String spaces = newString(" ", n-i);
            System.out.println(spaces+"*" + newString(" *", i-1));

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