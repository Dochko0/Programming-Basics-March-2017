package com.company;

import java.util.Scanner;

/**
 * Created by User on 24.4.2017 г..
 */
public class cgd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());


        while (b != 0){
            int temp = b;
            b=a%b;
            a=temp;

        }
        System.out.println(a);
    }
}
