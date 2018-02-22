package com.company;

import java.util.Scanner;

/**
 * Created by User on 7.5.2017 г..
 */
public class NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberM = Integer.parseInt(scanner.nextLine());
        int numberN = Integer.parseInt(scanner.nextLine());
        int numberL = Integer.parseInt(scanner.nextLine());
        int specialNumber = Integer.parseInt(scanner.nextLine());
        int controlNumber = Integer.parseInt(scanner.nextLine());
        int number = 0;

        for (int i = numberM; i >= 1; i--) {
            for (int j = numberN; j >= 1; j--) {
                for (int k = numberL; k >= 1; k--) {
                    number = i * 100 + j * 10 + k;

                    if (number % 3 == 0) {
                        specialNumber += 5;
                    } else if ((number - 5) % 10 == 0) {
                        specialNumber -= 2;
                    } else if (number % 2 == 0) {
                        specialNumber = specialNumber * 2;
                    }

                    if (specialNumber >= controlNumber) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNumber);
                        break;
                    }
                }
                if (specialNumber >= controlNumber) {
                    break;
                }
            }
            if (specialNumber >= controlNumber) {
                break;
            }
        }
        if (specialNumber < controlNumber) {
            System.out.printf("No! %d is the last reached special number.", specialNumber);
        }
    }
}

