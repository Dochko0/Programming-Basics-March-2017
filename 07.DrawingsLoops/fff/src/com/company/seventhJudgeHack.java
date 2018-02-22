package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 20.4.2017 г..
 */
public class seventhJudgeHack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int heightMax = 2*n - 1;
        int widthMax = 2*n -1;

        List<String> hack = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String spaces = newString(" ", (n-1)-i);
            String lineToPrint = spaces+"*" + newString(" *", i);
            System.out.println(lineToPrint);
            hack.add(lineToPrint);

        }

        for (int i = hack.size()-2; i >= 0; i--) {
            System.out.println(hack.get(i));
            
        }



    }
    public static String newString(String text, int repeatCount) {
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < repeatCount; i++) {
            a.append(text);
        }
        return a.toString();
    }
}
