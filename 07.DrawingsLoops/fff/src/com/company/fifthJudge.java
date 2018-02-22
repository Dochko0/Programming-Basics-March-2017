package com.company;

import java.util.Scanner;

/**
 * Created by User on 20.4.2017 г..
 */
public class fifthJudge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("+" + newString(" -" , n-2) + " +");
        for (int i = 0; i < n-2; i++) {
            System.out.println("|" + newString(" -" , n-2) + " |");
        }
        System.out.println("+" + newString(" -" , n-2) + " +");

    }
    public static String newString(String text, int repeatCount) {
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {
            a.append(text);
        }
        return a.toString();
    }
}

