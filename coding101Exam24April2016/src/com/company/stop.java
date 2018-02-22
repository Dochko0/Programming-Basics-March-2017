package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = 0;
        int u = 0;

        System.out.println(newString(".", n + 1) + newString("_", 2 * n + 1) + newString(".", n + 1));

        for (int i = 1; i <= n; i++) {
            System.out.println(newString(".", n - i + 1) + "//" + newString("_", 2*n + i - 2 + m) +
                    "\\\\" + newString(".", n - i + 1));
            m += 1;
        }
        System.out.println("//" + newString("_", 2*n-3) + "STOP!" + newString("_", 2*n-3) + "\\\\");

        for (int i = 0; i < n; i++) {
            System.out.println(newString("." , i) + "\\\\" + newString("_", (4*n-1)-i-u)+"//" + newString("." , i));
            u+=1;
        }


    }

    public static String newString(String text, int repeatCount) {
        String a = "";

        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
