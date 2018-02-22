package com.company;

import java.util.Scanner;

/**
 * Created by User on 5.5.2017 г..
 */
public class Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String plus = "+";
        String wave = newString("~", num-2);
        String dot = newString(".", 2*num+1);
        System.out.println(plus+wave+plus+dot);

        for (int i = 0; i < 2*num+1; i++) {
            String leftDots = newString(".",i);
            String rightDots = newString(".", 2*num-i);
            System.out.println("|"+leftDots+"\\"+wave+"\\"+rightDots);
        }
        for (int i = 0; i < 2*num+1; i++) {
            String leftDots = newString(".",i);
            String rightDots = newString(".", 2*num-i);
            System.out.println(leftDots+"\\"+rightDots+"|"+wave+"|");
        }
        System.out.println(dot+plus+wave+plus);
    }
    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
