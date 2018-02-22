package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.4.2017 г..
 */
public class Battles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstGamer = Integer.parseInt(scanner.nextLine());
        int secondGamer = Integer.parseInt(scanner.nextLine());
        int battlesNum = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        int m = 1;
        int p = 1;

        for (int i = 1; i <= firstGamer; i++) {
            if (counter <= battlesNum) {
                for (int j = 1; j <= secondGamer; j++) {
                    if (counter <= battlesNum) {
                        System.out.printf("(%d <-> %d) ", i, j);
                        counter++;
                    }
                }
            }
        }
    }
}