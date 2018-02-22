package com.company;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        System.out.println(Math.PI*r*r);
        System.out.println(2*Math.PI*r);
    }
}
