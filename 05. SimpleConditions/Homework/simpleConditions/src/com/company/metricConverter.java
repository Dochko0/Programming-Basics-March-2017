package com.company;

import java.util.Scanner;

/**
 * Created by User on 19.3.2017 г..
 */
public class metricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String convertUnit = scanner.nextLine();
        double forConvert = 0;
        double result = 0;

        double meter = 1;
        double milimeter = 1000.0;
        double centimeter = 100.0;
        double miles = 0.000621371192;
        double inches = 39.3700787;
        double kilometers = 0.001;
        double feet = 3.2808399;
        double yard = 1.0936133;

        if (input.equals("mm")){
            forConvert = number/milimeter;
        }
        else if (input.equals("cm")){
            forConvert = number/centimeter;
        }
        else if (input.equals("mi")){
            forConvert = number/miles;
        }
        else if (input.equals("in")){
            forConvert = number/inches;
        }
        else if (input.equals("km")){
            forConvert = number/kilometers;
        }
        else if (input.equals("ft")){
            forConvert = number/feet;
        }
        else if (input.equals("yd")){
            forConvert = number/yard;
        }
        else if (input.equals("m")){
            forConvert = number/meter;
        }

        if (convertUnit.equals("mm")){
            result = forConvert*milimeter;
        }
        else if (convertUnit.equals("cm")) {
            result = forConvert * centimeter;
        }
        else if (convertUnit.equals("mi")) {
            result = forConvert * miles;
        }
        else if (convertUnit.equals("in")) {
            result = forConvert * inches;
        }
        else if (convertUnit.equals("km")) {
            result = forConvert * kilometers;
        }
        else if (convertUnit.equals("ft")) {
            result = forConvert * feet;
        }
        else if (convertUnit.equals("yd")) {
            result = forConvert * yard;
        }
        else if (convertUnit.equals("m")) {
            result = forConvert * meter;
        }


        //System.out.println(result + " " + convertUnit);
        System.out.printf("%f %s" , result , convertUnit);
    }
}
