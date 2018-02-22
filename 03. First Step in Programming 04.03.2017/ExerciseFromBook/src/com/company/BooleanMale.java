package com.company;

import java.util.Scanner;

/**
 * Created by User on 8.3.2017 г..
 */
public class BooleanMale {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your sex: ");

        String sex = scanner.nextLine();
        String sex1 = "male";
        String sex2 = "male";

        boolean isEqual;
        isEqual = sex.equals(sex1);
        boolean isMale1 = (sex2 == sex1);

        System.out.println(isEqual);
        System.out.println(isMale1);
    }
}
