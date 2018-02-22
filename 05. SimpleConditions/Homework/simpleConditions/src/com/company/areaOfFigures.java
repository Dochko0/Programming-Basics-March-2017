package com.company;

import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());

            System.out.println(side*side);
        }
        else if (figure.equals("rectangle")){
            double firstSide = Double.parseDouble(scanner.nextLine());
            double secondSide = Double.parseDouble(scanner.nextLine());
            System.out.println(firstSide*secondSide);
        }
        else if (figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            double area = radius*radius*Math.PI;
            System.out.printf("%.3f" , area);
        }
        else if (figure.equals("triangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double visochina = Double.parseDouble(scanner.nextLine());
            System.out.println((side*visochina)/2);
        }
    }
}
