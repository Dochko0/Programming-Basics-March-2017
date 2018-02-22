package com.company;

import java.util.Scanner;

/**
 * Created by User on 5.5.2017 г..
 */
public class TrainersSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lectures = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

//        String jelev = "Jelev";
//        String royal = "RoYal";
//        String roli = "Roli";
//        String trofon = "Trofon";
//        String sino = "Sino";

        double jelev = 0.0;
        double royal = 0.0;
        double roli = 0.0;
        double trofon = 0.0;
        double sino = 0.0;
        double others = 0.0;

        for (int i = 0; i < lectures; i++) {
            String name = scanner.nextLine();
            if (name.equals("Jelev")){
                jelev++;
            }else if (name.equals("RoYaL")){
                royal++;
            }else if (name.equals("Roli")){
                roli++;
            }else if (name.equals("Trofon")){
                trofon++;
            }else if (name.equals("Sino")){
                sino++;
            }else {
                others++;
            }
        }
        double part = budget/lectures;

        System.out.printf("Jelev salary: %.2f lv\n", jelev*part);
        System.out.printf("RoYaL salary: %.2f lv\n", royal*part);
        System.out.printf("Roli salary: %.2f lv\n", roli*part);
        System.out.printf("Trofon salary: %.2f lv\n", trofon*part);
        System.out.printf("Sino salary: %.2f lv\n", sino*part);
        System.out.printf("Others salary: %.2f lv\n", others*part);
    }
}
