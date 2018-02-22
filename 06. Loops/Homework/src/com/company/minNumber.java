package com.company;

import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class minNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num<min){
                min=num;
            }
        }
        System.out.println(min);
    }
}
