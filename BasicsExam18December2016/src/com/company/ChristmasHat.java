package com.company;

import java.util.Scanner;

/**
 * Created by User on 3.5.2017 г..
 */
public class ChristmasHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        String dots = newString(".", 2*num-1);

        System.out.println(dots + "/|\\" + dots);
        System.out.println(dots + "\\|/" + dots);

        for (int i = 0; i < 2*num; i++) {

            String middleDots = newString(".", (2*num-1)-i);
            String dash  = newString("-", i);
            String star = "*";

            System.out.println(middleDots + star + dash + star + dash + star + middleDots);
        }
        String stars = newString("*", 4*num+1);
        System.out.println(stars);

        for (int i = 0; i < (2*num+1); i++) {
            System.out.printf("*");
            if (i!=2*num)
            System.out.printf(".");
        }
        System.out.println();
        System.out.println(stars);


    }
    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
