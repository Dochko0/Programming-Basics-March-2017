package com.company;

import java.util.Scanner;

/**
 * Created by User on 24.4.2017 г..
 */
public class chetniStepeniNa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int n = 1;
        System.out.println("1");

        for (int i = 1; i <= num; i++) {
            if (i%2==0){
                System.out.println(n*=4);
            }



        }
    }
}
