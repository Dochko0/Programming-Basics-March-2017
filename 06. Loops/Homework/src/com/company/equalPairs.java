package com.company;

import java.util.Scanner;

/**
 * Created by User on 30.3.2017 г..
 */
public class equalPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int summary = 0;
        int afterSum = 0;
        int afterSum1 = 0;
        int afterSum2 = 0;
        int afterSum3 = 0;
        int afterSum4 = 0;
        int afterSum5 = 0;
        int afterSum6 = 0;
        int afterSum7 = 0;
        int check = 0;
        int difference = 0;
        int difference1 = 0;
        int difference2 = 0;
        int difference3 = 0;
        int difference4 = 0;
        int difference5 = 0;
        int difference6 = 0;
        int difference7 = 0;
        int difference8 = 0;
        int difference9 = 0;
        int difference10 = 0;
        int difference11 = 0;
        int difference12 = 0;
        int difference13 = 0;
        int difference14 = 0;
        int difference15 = 0;
        int difference16 = 0;
        int difference17 = 0;
        int difference18 = 0;
        int difference19 = 0;
        int difference20 = 0;
        int difference21 = 0;
        int difference22 = 0;
        int difference23 = 0;
        int difference24 = 0;
        int difference25 = 0;
        int difference26 = 0;
        int difference27 = 0;
        int difference28 = 0;
        int difference29 = 0;
        int difference30 = 0;
        int difference31 = 0;
        int difference32 = 0;
        int difference33 = 0;
        int difference34 = 0;
        int difference35 = 0;
        int difference36 = 0;
        int difference37 = 0;
        int difference38 = 0;
        int difference39 = 0;
        int difference40 = 0;
        int difference41 = 0;
        int difference42 = 0;
        int difference43 = 0;
        int difference44 = 0;
        int difference45 = 0;
        int difference46 = 0;
        int difference47 = 0;
        int difference48 = 0;
        int difference49 = 0;
        int difference50 = 0;
        int difference51 = 0;
        int difference52 = 0;
        int difference53 = 0;
        int difference54 = 0;
        int difference55 = 0;
        int difference56 = 0;
        int difference57 = 0;
        int maxDifference = 0;
        int maxDifference1 = 0;
        int maxDifference2 = 0;
        int maxDifference3 = 0;
        int maxDifference4 = 0;
        int maxDifference5 = 0;
        int maxDifference6 = 0;
        int maxDifference7 = 0;
        int maxDifference8 = 0;
        int maxDifference9 = 0;
        int maxDifference10 = 0;
        int maxDifference11 = 0;
        int maxDifference12 = 0;
        int maxDifference13 = 0;
        int maxDifference14 = 0;
        int maxDifference15 = 0;
        int maxDifference16 = 0;
        int maxDifference17 = 0;
        int max = 0;
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int max4 = 0;
        int max5 = 0;
        int max6 = 0;
        int max7 = 0;
        int max8 = 0;

        int mmax = 0;
        int mmax1 = 0;
        int mmax2 = 0;
        int mmax3 = 0;
        int mmax4 = 0;

        int amax = 0;
        int amax1 = 0;
        int amax2 = 0;
        int extraMax = 0;
        int extraMax1 = 0;


        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        summary = num1 + num2;

        for (int i = 0; i < n - 1; i++) {

            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());

            if (n == 0) {
                afterSum = number1 + number2;
                difference = Math.abs(afterSum - summary);
            }
            if (n == 1) {
                afterSum1 = number1 + number2;
                difference1 = Math.abs(afterSum1 - summary);
                difference8 = Math.abs(afterSum - afterSum1);
            }
            if (n == 2) {
                afterSum2 = number1 + number2;
                difference2 = Math.abs(afterSum2 - summary);
                difference9 = Math.abs(afterSum2 - afterSum);
                difference10 = Math.abs(afterSum2 - afterSum1);
            }
            if (n == 3) {
                afterSum3 = number1 + number2;
                difference3 = Math.abs(afterSum3 - summary);
                difference11 = Math.abs(afterSum3 - afterSum);
                difference12 = Math.abs(afterSum3 - afterSum1);
                difference13 = Math.abs(afterSum3 - afterSum2);
            }
            if (n == 4) {
                afterSum4 = number1 + number2;
                difference4 = Math.abs(afterSum4 - summary);
                difference14 = Math.abs(afterSum4 - afterSum);
                difference15 = Math.abs(afterSum4 - afterSum1);
                difference16 = Math.abs(afterSum4 - afterSum2);
                difference17 = Math.abs(afterSum4 - afterSum3);
            }
            if (n == 5) {
                afterSum5 = number1 + number2;
                difference5 = Math.abs(afterSum5 - summary);
                difference18 = Math.abs(afterSum5 - afterSum2);
                difference19 = Math.abs(afterSum5 - afterSum);
                difference20 = Math.abs(afterSum5 - afterSum3);
                difference21 = Math.abs(afterSum5 - afterSum4);
                difference22 = Math.abs(afterSum5 - afterSum1);
            }
            if (n == 6) {
                afterSum6 = number1 + number2;
                difference6 = Math.abs(afterSum6 - summary);
                difference23 = Math.abs(afterSum6 - afterSum);
                difference24 = Math.abs(afterSum6 - afterSum1);
                difference25 = Math.abs(afterSum6 - afterSum2);
                difference26 = Math.abs(afterSum6 - afterSum3);
                difference27 = Math.abs(afterSum6 - afterSum4);
                difference28 = Math.abs(afterSum6 - afterSum5);

            }
            if (n == 7) {
                afterSum7 = number1 + number2;
                difference7 = Math.abs(afterSum7 - summary);
                difference29 = Math.abs(afterSum7 - afterSum);
                difference30 = Math.abs(afterSum7 - afterSum1);
                difference31 = Math.abs(afterSum7 - afterSum2);
                difference32 = Math.abs(afterSum7 - afterSum3);
                difference33 = Math.abs(afterSum7 - afterSum4);
                difference34 = Math.abs(afterSum7 - afterSum5);
                difference35 = Math.abs(afterSum7 - afterSum6);
            }

            if (afterSum == summary || afterSum1 == summary || afterSum2 == summary ||
                    afterSum3 == summary || afterSum4 == summary || afterSum5 == summary || afterSum6 == summary ||
                    afterSum7 == summary) {
                check++;
            } else {
                maxDifference = Math.max(difference, difference1);
                maxDifference1 = Math.max(difference2, difference3);
                maxDifference2 = Math.max(difference4, difference5);
                maxDifference3 = Math.max(difference6, difference7);
                maxDifference4 = Math.max(difference8, difference9);
                maxDifference5 = Math.max(difference10, difference11);
                maxDifference6 = Math.max(difference12, difference13);
                maxDifference7 = Math.max(difference14, difference15);
                maxDifference8 = Math.max(difference16, difference17);
                maxDifference9 = Math.max(difference18, difference19);
                maxDifference10 = Math.max(difference20, difference21);
                maxDifference11 = Math.max(difference22, difference23);
                maxDifference12 = Math.max(difference24, difference25);
                maxDifference13 = Math.max(difference26, difference27);
                maxDifference14 = Math.max(difference28, difference29);
                maxDifference15 = Math.max(difference30, difference31);
                maxDifference16 = Math.max(difference32, difference33);
                maxDifference17 = Math.max(difference34, difference35);

                max = Math.max(maxDifference, maxDifference1);
                max1 = Math.max(maxDifference2, maxDifference3);
                max2 = Math.max(maxDifference4, maxDifference5);
                max3 = Math.max(maxDifference6, maxDifference7);
                max4 = Math.max(maxDifference8, maxDifference9);
                max5 = Math.max(maxDifference10, maxDifference11);
                max6 = Math.max(maxDifference12, maxDifference13);
                max7 = Math.max(maxDifference14, maxDifference15);
                max8 = Math.max(maxDifference16, maxDifference17);

                mmax = Math.max(max, max1);
                mmax1 = Math.max(max2, max3);
                mmax2 = Math.max(max4, max5);
                mmax3 = Math.max(max6, max7);
                mmax4 = Math.max(max, max8);

                amax = Math.max(mmax, mmax1);
                amax1 = Math.max(mmax2, mmax3);
                amax2 = Math.max(mmax4, mmax1);
                extraMax = Math.max(amax, amax1);


            }
            if (check == (n - 1)) {
                System.out.println("Yes, value=" + summary);
            } else {
                if (amax2>extraMax) {
                    System.out.println("No, maxdiff=" + amax2);
                }else{
                    System.out.println("No, maxdiff=" + extraMax);
                }
            }
        }
    }
}
