package com.company;

import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class maxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num>max){
                max=num;
            }
        }
        System.out.println(max);
    }
}
