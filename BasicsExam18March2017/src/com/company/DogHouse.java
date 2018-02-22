package com.company;

import java.util.Scanner;

public class DogHouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aSide= Double.parseDouble(scanner.nextLine());
        double bSide = Double.parseDouble(scanner.nextLine());
        double h = bSide-(aSide/2);

        double sides = 2*(aSide*(aSide/2))+2*(aSide*0.5*aSide*0.5)+(aSide*0.5*h) - (aSide/5)*(aSide/5);
        double roof = 2*(aSide*aSide*0.5);

        double green = sides/3;
        double red = roof/5;

        System.out.printf("%.2f\n",green);
        System.out.printf("%.2f",red);
    }
}
