package com.company;

import java.util.Scanner;
import java.util.Timer;

/**
 * Created by User on 26.4.2017 г..
 */
public class magicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        //long startTime = System.nanoTime();


        int start = 111111;

        while (start <= 999999) {
            int sum = 1;
            int secondStart = start;
            for (int i = 0; i < 6; i++) {
                sum = sum * (secondStart % 10);
                secondStart = secondStart / 10;
            }
            if (sum==num)
                System.out.print(start + " ");
            start++;
        }

        //long endTime   = System.nanoTime();
        //long totalTime = endTime - startTime;
        //System.out.println(totalTime);
    }
}
