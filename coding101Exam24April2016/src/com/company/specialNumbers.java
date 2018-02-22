package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class specialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int specialNumber = 1111;
        int checker = 0;

        while (specialNumber<=9999){
            int printSpecial = specialNumber;
            for (int i = 0; i < 4; i++) {
                int ch = printSpecial%10;
                if (ch==0) {
                    break;
                }else if (n%ch==0){
                    checker++;
                }
                printSpecial = printSpecial/10;
            }
            if (checker==4){
                System.out.print(specialNumber + " ");
            }
            specialNumber++;
            checker=0;
        }
    }
}
