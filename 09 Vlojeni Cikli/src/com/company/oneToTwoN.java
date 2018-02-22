package com.company;

import java.util.Scanner;

/**
 * Created by User on 24.4.2017 г..
 */
public class oneToTwoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //System.out.println("1");
        int num =1;

        for (int i = 0; i <= n; i++) {
            System.out.println(num);
            num=2*num;

        }
    }
}
