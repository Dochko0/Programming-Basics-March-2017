package com.company;

import java.util.Scanner;

/**
 * Created by User on 23.4.2017 г..
 */
public class tenthJudge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());



    }
    public static String insertString(String text, int repeatCount) {
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {
            a.append(text);
        }
        return a.toString();
    }
}
