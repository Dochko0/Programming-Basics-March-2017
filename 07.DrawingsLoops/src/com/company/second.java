package com.company;

import java.util.Scanner;

/**
 * Created by User on 11.4.2017 г..
 */
public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String line = new String (new char [n]).replaceAll("\0", "* ");
            System.out.println(line.trim());

        }
    }
    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
