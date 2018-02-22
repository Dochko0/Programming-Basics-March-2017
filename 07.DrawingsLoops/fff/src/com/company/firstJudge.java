package com.company;

import java.util.Scanner;

/**
 * Created by User on 19.4.2017 г..
 */
public class firstJudge {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(newString("*", 10));
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
