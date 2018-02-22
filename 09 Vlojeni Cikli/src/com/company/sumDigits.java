package com.company;

import java.util.Scanner;

/**
 * Created by User on 25.4.2017 г..
 */
public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        do {
            sum += (num%10);
            num=num/10;

        }while (num >0);
        System.out.print(sum);

    }
}
