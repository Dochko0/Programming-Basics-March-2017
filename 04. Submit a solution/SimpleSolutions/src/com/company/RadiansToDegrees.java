package com.company;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class RadiansToDegrees {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float radians = Float.parseFloat(scanner.nextLine());

        float degrees = (float) (radians * 57.2958);

        System.out.println(degrees);
    }
}
