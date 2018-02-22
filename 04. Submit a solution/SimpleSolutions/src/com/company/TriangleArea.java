package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float side = Float.parseFloat(scanner.nextLine());
        float h = Float.parseFloat(scanner.nextLine());

        float area = (side * h)/2;

        System.out.printf("Triangle area = %.2f" , area);



    }
}
