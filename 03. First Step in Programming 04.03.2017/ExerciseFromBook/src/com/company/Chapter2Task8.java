package com.company;

/**
 * Created by User on 9.3.2017 г..
 */
public class Chapter2Task8 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            for (int j = i; j < 3; j++) {
                System.out.print("-");
            }
            if (i==1){
                System.out.print("00");
            }
            for (int k = 0; k <= 2; k++) {
                System.out.print("0");
            }
            for (int j = i; j < 3; j++) {
                System.out.print("-");
                if (i==1){
                    break;
                }
            }
            if (i==1){
                System.out.print("00");
            }
            for (int k = 0; k <= 2; k++) {
                System.out.print("0");
            }
            for (int j = i; j < 3; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println("-0000000000000-");

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("-");
            }
            for (int k = i; k < 7; k++) {
                System.out.print("0");
            }
            for (int l = i; l < 6; l++) {
                System.out.print("0");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
}
