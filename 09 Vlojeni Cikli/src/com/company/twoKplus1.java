package com.company;

import java.util.Scanner;

/**
 * Created by User on 24.4.2017 г..
 */
public class twoKplus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i= 2*i+1) {
            System.out.println(i);
        }
    }
}
