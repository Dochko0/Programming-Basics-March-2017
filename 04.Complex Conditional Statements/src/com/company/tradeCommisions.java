package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by User on 24.3.2017 г..
 */
public class tradeCommisions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double bonus = 0 ;

        if (sales>=0) {
            if (sales >= 0 && sales <= 500) {
                switch (city) {
                    case "Sofia":
                        bonus = sales*0.05;
                        System.out.printf("%.2f", bonus);
                        break;
                    case "Varna":
                        bonus = sales*0.045;
                        System.out.printf("%.2f", bonus);
                        break;
                    case "Plovdiv":
                        bonus = sales*0.055;
                        System.out.printf("%.2f", bonus);
                        break;
                    default:
                        System.out.println("error");
                }
            }
            else if (sales > 500 && sales <= 1000) {
                switch (city) {
                    case "Sofia":
                        bonus = sales*0.07;
                        System.out.printf("%.2f", bonus);
                        break;
                    case "Varna":
                        bonus = sales*0.075;
                        System.out.printf("%.2f", bonus);
                        break;
                    case "Plovdiv":
                        bonus = sales*0.08;
                        System.out.printf("%.2f", bonus);
                        break;
                    default:
                        System.out.println("error");
                }
            }
            else if (sales > 1000 && sales <= 10000) {
                switch (city) {
                    case "Sofia":
                        bonus = sales*0.08;
                        System.out.printf("%.2f", bonus);
                        break;
                    case "Varna":
                        bonus = sales*0.10;
                        System.out.printf("%.2f", bonus);
                        break;
                    case "Plovdiv":
                        bonus = sales*0.12;
                        System.out.printf("%.2f", bonus);
                        break;
                    default:
                        System.out.println("error");
                }
            }
            else if (sales > 10000) {
                switch (city) {
                    case "Sofia":
                        bonus = sales*0.12;
                        System.out.printf("%.2f", bonus);
                        break;
                    case "Varna":
                        bonus = sales*0.13;
                        System.out.printf("%.2f", bonus);
                        break;
                    case "Plovdiv":
                        bonus = sales*0.145;
                        System.out.printf("%.2f", bonus);
                        break;
                    default:
                        System.out.println("error");
                }
            }
        }else {
            System.out.println("error");
        }
    }
}
