package com.company;

import java.util.Scanner;

/**
 * Created by User on 25.4.2017 г..
 */
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int n=1;

        while (num>1){
            n= n*num;
            num--;
        }
        System.out.println(n);
    }
}
