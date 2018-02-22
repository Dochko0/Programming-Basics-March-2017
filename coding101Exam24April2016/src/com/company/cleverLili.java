package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class cleverLili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageLili = Integer.parseInt(scanner.nextLine());
        double priceLaundry = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());
        double numToy = 0;
        double sum = 0;
        double sumSum = 10;
        int checker = 0;

        for (int i = 1; i <= ageLili; i++) {
            if (i % 2 == 0) {
                sum += sumSum;
                sumSum += 10;
                checker++;
            } else {
                numToy++;
            }
        }
        sum = sum - checker;
        //System.out.println(sum);
        double moneyForToy = numToy*toyPrice;
        double moneyForLaundry = moneyForToy+sum;

        if (moneyForLaundry>=priceLaundry){
            System.out.printf("Yes! %.2f", (moneyForLaundry-priceLaundry));
        }else {
            System.out.printf("No! %.2f" , ((moneyForLaundry-priceLaundry))*-1);
        }
    }
}
