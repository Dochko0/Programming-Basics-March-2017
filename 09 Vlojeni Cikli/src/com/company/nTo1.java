package com.company;

import java.util.Scanner;

/**
 * Created by User on 24.4.2017 г..
 */
public class nTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i > 0; i--) {
            System.out.println(i);
            
        }
    }
}
