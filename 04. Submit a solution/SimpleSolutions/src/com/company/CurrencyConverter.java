package com.company;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double suma = Double.parseDouble(scanner.nextLine());

        String vhod = scanner.nextLine();
        String izhod = scanner.nextLine();

        double lev = 1;
        double dolar = 1.79549;
        double evro = 1.95583;
        double lira = 2.53405;


        if(vhod.equals("BGN") && izhod.equals("USD")){
            double result = suma/dolar;
            System.out.printf("%.2f USD \n" , result);
        }
        if(vhod.equals("BGN") && izhod.equals("EUR")){
            double result = suma/evro;
            System.out.printf("%.2f EUR \n" , result);
        }
        if(vhod.equals("BGN") && izhod.equals("GBP")){
            double result = suma/lira;
            System.out.printf("%.2f GBP \n" , result);
        }
        if(vhod.equals("USD") && izhod.equals("BGN")){
            double result = suma*(dolar/lev);
            System.out.printf("%.2f BGN \n" , result);
        }
        if(vhod.equals("EUR") && izhod.equals("BGN")){
            double result = suma*(evro/lev);
            System.out.printf("%.2f BGN \n" , result);
        }
        if(vhod.equals("GBP") && izhod.equals("BGN")){
            double result = suma*(lira/lev);
            System.out.printf("%.2f BGN \n" , result);
        }
        if(vhod.equals("GBP") && izhod.equals("USD")){
            double result = suma*(lira/dolar);
            System.out.printf("%.2f USD \n" , result);
        }
        if(vhod.equals("EUR") && izhod.equals("USD")){
            double result = suma*(evro/dolar);
            System.out.printf("%.2f USD \n" , result);
        }
        if(vhod.equals("USD") && izhod.equals("GBP")){
            double result = suma*(dolar/lira);
            System.out.printf("%.2f GBP \n" , result);
        }
        if(vhod.equals("USD") && izhod.equals("EUR")){
            double result = suma*(dolar/evro);
            System.out.printf("%.2f %s \n" , result , izhod);
        }
        if(vhod.equals("EUR") && izhod.equals("GBP")){
            double result = suma*(evro/lira);
            System.out.printf("%.2f %s \n" , result , izhod);
        }
        if(vhod.equals("GBP") && izhod.equals("EUR")){
            double result = suma*(lira/evro);
            System.out.printf("%.2f %s \n" , result , izhod);
        }
    }
}
