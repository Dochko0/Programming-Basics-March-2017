package com.company;

import java.util.Scanner;

/**
 * Created by User on 25.4.2017 г..
 */
public class factorialDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int n = 1;

        do {
            n=n*num;
            num--;

        }while (num>0);
        System.out.println(n);
    }
}
