package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num-2; i++) {
            if (i%2!=0){
                System.out.printf(newString("*", num-2) + "\\ /" + newString("*", num-2) + "\n");
            }else{
                System.out.printf(newString("-", num-2) + "\\ /" + newString("-", num-2) + "\n");
            }
        }
        System.out.println(newString(" ",num-1) + "@");
        for (int i = 1; i <= num-2; i++) {
            if (i%2!=0){
                System.out.printf(newString("*", num-2) + "/ \\" + newString("*", num-2) + "\n");
            }else{
                System.out.printf(newString("-", num-2) + "/ \\" + newString("-", num-2)+"\n");
            }
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
