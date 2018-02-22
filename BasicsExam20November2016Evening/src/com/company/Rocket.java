package com.company;

import java.util.Scanner;

/**
 * Created by User on 28.4.2017 г..
 */
public class Rocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            String dots = newString(".", (int) (1.5 * num - i));
            String spaces = newString(" ", (2 * (i - 1)));
            System.out.println(dots + "/" + spaces + "\\" + dots);
        }

        String secDot = newString(".", num / 2);
        String secStars = newString("*", (int) (2 * num));
        String cherti = newString("\\", 3 * num - (2 + num));
        System.out.println(secDot + secStars + secDot);

        for (int i = 0; i < 2 * num; i++) {
            System.out.println(secDot + "|" + cherti + "|" + secDot);
        }

        for (int i = 0; i < num / 2; i++) {
            String thirdDot = newString(".", num / 2 - i);
            String thirdStars = newString("*", 3 * num - (2 + num) + 2 * i);
            System.out.println(thirdDot + "/" + thirdStars + "\\" + thirdDot);



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
