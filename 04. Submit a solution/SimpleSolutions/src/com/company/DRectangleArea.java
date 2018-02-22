package com.company;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class DRectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float x1 = Float.parseFloat(scanner.nextLine());
        float y1 = Float.parseFloat(scanner.nextLine());
        float x2 = Float.parseFloat(scanner.nextLine());
        float y2 = Float.parseFloat(scanner.nextLine());

        float width = Math.max(x1 , x2)- Math.min(x1 , x2);
        float heigh = Math.max(y1 , y2) - Math.min(y1 , y2);

        float perimeter = ((width + heigh)*2);
        float area = ((width)*(heigh));


        System.out.printf("%.2f \n" , area);
        System.out.printf("%.2f \n" , perimeter);
    }
}
