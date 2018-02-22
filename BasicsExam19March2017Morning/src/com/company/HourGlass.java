package com.company;

import java.util.Scanner;

/**
 * Created by User on 5.5.2017 г..
 */
public class HourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String firstLine = newString("*", 2*num+1);
        System.out.println(firstLine);

        String space = newString(" ", 2*num-3);
        System.out.println(".*"+space+"*.");

        for (int i = 0; i < num-2; i++) {
            String dots = newString(".", 2+i);
            String kliomba = newString("@", 2*num-5-2*i);

            System.out.println(dots+"*"+kliomba+"*"+dots);
        }

        String middleDots = newString(".", num);
        System.out.println(middleDots+"*"+middleDots);

        for (int i = 0; i <num-2 ; i++) {

            String dotsF = newString(".", num-1-i);
            String spaces = newString(" ", i);

            System.out.println(dotsF+"*"+spaces+"@"+spaces+"*"+dotsF);
        }

        String et = newString("@", 2*num-3);
        System.out.println(".*"+et+"*.");

        System.out.println(firstLine);


    }
    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
