package com.company;

import java.util.Scanner;

/**
 * Created by User on 5.5.2017 г..
 */
public class ControlNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numN = Integer.parseInt(scanner.nextLine());
        int numM = Integer.parseInt(scanner.nextLine());
        int controlNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;
        int fff=numM;

        for (int i = 1; i <= numN; i++) {
            numM=fff;
//            for (int j = numM; j >= 1; j--) {
//                sum = sum + i * 2 + j * 3;
//                counter++;
//
//                if (sum >= controlNum) {
//                    System.out.println(counter + " moves");
//                    System.out.printf("Score: %d >= %d", sum, controlNum);
//                    break;
//                }
//            }

            while (numM>=1){
                sum = sum + i * 2 + numM * 3;
                counter++;

                if (sum >= controlNum) {
                    System.out.println(counter + " moves");
                    System.out.printf("Score: %d >= %d", sum, controlNum);
                    break;
                }
                numM--;

            }
            if (sum >= controlNum) {
                break;
            }
        }
        if (sum < controlNum) {
            System.out.println(counter + " moves");
        }
    }
}
