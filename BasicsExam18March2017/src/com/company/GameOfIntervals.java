package com.company;

import java.util.Scanner;

/**
 * Created by User on 4.5.2017 г..
 */
public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double round = Double.parseDouble(scanner.nextLine());
        double result = 0.0;
        double counter = 0;
        double intervalOne = 0.0;
        double intervalTwo = 0.0;
        double intervalThree = 0.0;
        double intervalFour=0.0;
        double intervalFive = 0.0;
        double invalid = 0.0;

        for (int i = 0; i <round ; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (num>=0 && num<=9){
                result+=(num*20)/100;
                intervalOne++;
            }else if (num>=10 && num<=19){
                result+=(num*30)/100;
                intervalTwo++;
            }else if (num>=20 && num<=29){
                result+=(num*40)/100;
                intervalThree++;
            }else if (num>=30 && num<=39) {
                result += 50;
                intervalFour++;
            }else if (num>=40 && num<=50) {
                result += 100;
                intervalFive++;
            }else if (num<0 || num>50){
                result=result/2;
                invalid++;
            }
            counter++;
        }

        double perOne = (intervalOne/counter)*100;
        double perTwo = (intervalTwo/counter)*100;
        double perThree = (intervalThree/counter)*100;
        double perFour = (intervalFour/counter)*100;
        double perFive = (intervalFive/counter)*100;
        double perInvalid = (invalid/counter)*100;

        System.out.printf("%.2f\n",result);
        System.out.printf("From 0 to 9: %.2f%%\n",perOne);
        System.out.printf("From 10 to 19: %.2f%%\n",perTwo);
        System.out.printf("From 20 to 29: %.2f%%\n",perThree);
        System.out.printf("From 30 to 39: %.2f%%\n",perFour);
        System.out.printf("From 40 to 50: %.2f%%\n",perFive);
        System.out.printf("Invalid numbers: %.2f%%\n",perInvalid);
    }
}
