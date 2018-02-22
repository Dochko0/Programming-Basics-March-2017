package com.company;

import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class vowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int sum = 0;

        for (char i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum);
    }
}
