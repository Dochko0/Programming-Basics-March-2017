package com.company;

        import java.util.Scanner;

/**
 * Created by User on 1.5.2017 г..
 */
public class MaxCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int range = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            for (int j = firstNum; j <= secondNum; j++) {
                if (counter < range) {
                    System.out.printf("<%d-%d>", i, j);
                }
                counter++;
            }
        }
    }
}
