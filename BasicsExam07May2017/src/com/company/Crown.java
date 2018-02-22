package com.company;

import java.util.Scanner;

/**
 * Created by User on 7.5.2017 г..
 */
public class Crown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        String space = newString(" ", num-2);

        System.out.println("@"+space+"@"+space+"@");

        String secondSpace = newString(" ", num-3);
        String star = "*";

        System.out.println(star+star+secondSpace+star+secondSpace+star+star);

        for (int i = 0; i < num/2-2; i++) {
            String dot = newString(".", 1+i);
            String middleDot = newString(".", 1+2*i);
            String loopSpaces = newString(" ", (2*num-1-2*(1+i)-1-2*i-6)/2);

            System.out.println(star+dot+star+loopSpaces + star+middleDot+star+loopSpaces+star+dot+star);
        }

        String secondDots = newString(".", num/2-1);
        String secondMiddleDots = newString(".", 2*num-1-4-2*(num/2-1));

        System.out.println(star+secondDots+star+secondMiddleDots+star+secondDots+star);

        String thirdDots = newString(".", num/2);
        String secondStar = newString("*", (2*num-1-3-2*(num/2))/2);

        System.out.println(star+thirdDots+secondStar+"."+secondStar+thirdDots+star);

        String finStars = newString("*", 2*num-1);

        System.out.println(finStars);
        System.out.println(finStars);








    }

    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
