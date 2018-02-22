package com.company;

import java.util.Scanner;

/**
 * Created by User on 19.4.2017 г..
 */
public class forClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(newString("*", num));
    }
    public static String newString(String text , int repeatCount){
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a+= text ;
        }
        return a;
    }
}
