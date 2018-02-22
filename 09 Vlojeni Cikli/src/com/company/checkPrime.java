package com.company;

import java.util.Scanner;

/**
 * Created by User on 25.4.2017 г..
 */
public class checkPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int n = 0;
        int m = 2;
       // int counter = 0;
        boolean isPrime = true;

        if (num<=1){
            isPrime=false;
        }

        while (m <= num / 2) {
            if (num % m == 0) {
                System.out.println("Not prime");
                isPrime = false;
                break;
            }
           m++;
        }
        if (isPrime) {
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
