package com.company;

import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometersToTravel = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        double taxiFirstTax = 0.70;
        double taxiDayPrice = 0.79;
        double taxiNightPrice = 0.90;

        double busPrice = 0.09;
        double trainPrice = 0.06;

        double priceWithTaxi=0.0;
        double priceWithBus=0.0;
        double priceWithTrain=0.0;

        if (dayTime.equals("day"))
        {
            priceWithTaxi = taxiFirstTax + taxiDayPrice*kilometersToTravel;
        }
        else if (dayTime.equals("night"))
        {
            priceWithTaxi = taxiFirstTax + taxiNightPrice*kilometersToTravel;
        }

        if (kilometersToTravel>=20)
        {
            priceWithBus = busPrice*kilometersToTravel;
        }
        if (kilometersToTravel>=100)
        {
            priceWithTrain = trainPrice*kilometersToTravel;
        }
        if (priceWithTaxi<priceWithBus && priceWithTaxi<priceWithTrain)
        {
            System.out.println(priceWithTaxi);
        }
        else if (priceWithBus==0.0 && priceWithTrain==0.0)
        {
            System.out.println(priceWithTaxi);
        }
        else if (priceWithBus<priceWithTaxi && priceWithBus<priceWithTrain )
        {
            System.out.println(priceWithBus);
        }
        else if (priceWithBus<priceWithTaxi && priceWithTrain==0)
        {
            System.out.println(priceWithBus);
        }
        else if (priceWithTrain<priceWithTaxi && priceWithBus>priceWithTrain)
        {
            System.out.println(priceWithTrain);
        }
    }
}
