package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.4.2017 г..
 */
public class Axe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 0; i < n; i++) {
            String firstDash = newString("-", 3*n);
            String starsDash = newString("-", i);
            String secondDash = newString("-", 5*n - (3*n+2+i));
            System.out.println(firstDash + "*" + starsDash + "*" + secondDash);
        }

        for (int i = 0; i < Math.floor(n/2); i++) {
            String stars = newString("*", 3*n+1);
            String dash = newString("-", n-1);
            System.out.println(stars + dash + "*" +dash);
        }

        for (int i = 0; i < (Math.floor(n/2))-1; i++) {
            String firstDash = newString("-" , 3*n-i);
            String middleDash = newString("-", n-1+2*i);
            String secondDash = newString("-", n-1-i);
            System.out.println(firstDash + "*" + middleDash + "*" + secondDash);
            counter++;
        }

        String dash = newString("-" , 3*n-counter);
        String stars = newString("*", n+2*counter+1);
        String secondStars = newString("-", n-1-counter);

        System.out.println(dash + stars  + secondStars);

    }
    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
//29mins