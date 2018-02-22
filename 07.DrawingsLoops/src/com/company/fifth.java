package com.company;

import java.util.Scanner;

/**
 * Created by User on 11.4.2017 г..
 */
public class fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+" + " -" + " +");

        System.out.println("+" + " -" + " +");

    }
    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
