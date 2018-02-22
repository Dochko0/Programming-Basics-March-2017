package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class backToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = 0;

        System.out.println(newString(".", n) + newString("*", n*3) + newString(".", n));

        for (int i = 0; i < n-1; i++) {
            String points = newString("." , n-1-i);
            String centerPoints = newString("." , 3*n+(2*i));
            System.out.println(points + "*" + centerPoints + "*" + points);
        }
        System.out.println(newString("*", 5*n));

        for (int i = 1; i <= 2*n; i++) {
            String points = newString("." , i);
            String centerPoints = newString("." , n*5- 2*m-4);

            System.out.println(points + "*" + centerPoints + "*" + points);
            m++;
        }
        System.out.println(newString(".", 2*n+1) + newString("*" , n-2) + newString(".", 2*n+1));
    }


    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
