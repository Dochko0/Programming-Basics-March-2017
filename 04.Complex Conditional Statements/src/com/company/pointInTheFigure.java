package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.3.2017 г..
 */
public class pointInTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine());
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());

        if (x1 > 0 && x1 < (3 * h) && y1 > 0 && y1 < (h)) {
            System.out.println("inside");
        } else if (x1 > h && x1 < (2 * h) && y1 > h && y1 < (4 * h)) {
            System.out.println("inside");
        } else if (x1 > h && x1 < (2 * h) && y1 == h) {
            System.out.println("inside");
        } else if (x1 == 0 && y1 >= 0 && y1 <= h) {
            System.out.println("border");
        } else if (y1 == 0 && x1 > 0 && x1 <= (3 * h)) {
            System.out.println("border");
        } else if (y1 == h && x1 > 0 && x1 <= h) {
            System.out.println("border");
        } else if (y1 == h && x1 >= (2 * h) && x1 <= (3 * h)) {
            System.out.println("border");
        } else if (x1 == (3 * h) && y1 > 0 && y1 < h) {
            System.out.println("border");
        } else if (x1 == h && y1 > h && y1 <= (4 * h)) {
            System.out.println("border");
        } else if (x1 == (2 * h) && y1 > h && y1 <= (4 * h)) {
            System.out.println("border");
        } else if (y1 == (4 * h) && x1 > h && x1 < (2 * h)) {
            System.out.println("border");
        } else {
            System.out.println("outside");
        }
    }
}
