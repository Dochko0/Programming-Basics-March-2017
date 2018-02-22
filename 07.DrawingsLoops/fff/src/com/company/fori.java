package com.company;

import java.util.Scanner;

/**
 * Created by User on 19.4.2017 г..
 */
public class fori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
