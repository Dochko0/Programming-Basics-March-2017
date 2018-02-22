package com.company;

import java.util.Scanner;

/**
 * Created by User on 22.3.2017 г..
 */
public class invalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num < 100 && num != 0) {
            System.out.println("invalid");
        } else if (num > 200 && num != 0) {
            System.out.println("invalid");
        }
    }
}
