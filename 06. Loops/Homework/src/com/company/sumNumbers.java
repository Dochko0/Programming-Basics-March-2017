package com.company;

import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            result = result+number;
        }
        System.out.println(result);
    }
}
