package com.company;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class USDtoBGN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float dollar = Float.parseFloat(scanner.nextLine());

        float lev = (float) (dollar*1.79549);

        System.out.println(lev);

    }
}
