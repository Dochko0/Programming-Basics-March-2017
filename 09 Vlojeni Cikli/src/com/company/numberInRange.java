package com.company;

import java.util.Scanner;

/**
 * Created by User on 24.4.2017 г..
 */
public class numberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Еnter a number in the range [1...100]: ");
        int num = Integer.parseInt(scanner.nextLine());


        while (num < 1 || num>100){
            System.out.println("Еnter a number in the range [1...100]: ");
            num=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(num);
    }
}
