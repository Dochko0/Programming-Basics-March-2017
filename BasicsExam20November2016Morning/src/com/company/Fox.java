package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.4.2017 г..
 */
public class Fox {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            String star = newString("*", i);
            String dash = newString("-", 2*num+1-2*i);
            System.out.println(star + "\\" + dash + "/" + star);
        }

        for (int i = 0; i < Math.floor(num/3); i++) {
            String stars = newString("*", (int) Math.floor(num/2+i));
            String midStars = newString("*", (2*num) -(2*((int) Math.floor(num/2+i)))-1);
            System.out.println("|" + stars+"\\"+midStars+"/"+stars+"|");
        }
        for (int i = 1; i <= num; i++) {
            String star = newString("-", i);
            String dash = newString("*", 2*num+1-2*i);
            System.out.println(star + "\\" + dash + "/" + star);
        }
    }
    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
