package com.company;

import java.util.Scanner;

/**
 * Created by User on 4.5.2017 г..
 */
public class lettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().charAt(0);
        char secondLetter = scanner.nextLine().charAt(0);
        char missLetter = scanner.nextLine().charAt(0);
        int counter = 0;

        StringBuilder sb = new StringBuilder();

        for (char i = firstLetter; i <= secondLetter; i++) {
            for (char j = firstLetter; j <= secondLetter; j++) {
                for (char k = firstLetter; k <= secondLetter ; k++) {
                    if (i!=missLetter && j!=missLetter && k!=missLetter){
                        sb.append(i);
                        sb.append(j);
                        sb.append(k);
                        sb.append(' ');
                        counter++;
                    }
                }
            }
        }
        System.out.print(sb.toString());
        System.out.println(counter);
    }
}
