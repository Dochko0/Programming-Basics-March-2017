package com.company;

import java.util.Scanner;

/**
 * Created by User on 19.4.2017 г..
 */
public class secondJudge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            System.out.println(newString("*", n));
        }
    }
    public static String newString(String text , int repeatCount){
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {
            a.append(text) ;
        }
        return a.toString();
    }
}