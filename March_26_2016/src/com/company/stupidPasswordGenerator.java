package com.company;

import java.util.Scanner;

/**
 * Created by User on 31.3.2017 г..
 */
public class stupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
         int l = Integer.parseInt(scanner.nextLine());
         int first = 1;
         int second = 1;
         char firstLetter = 0;
         char secondLetter = 0;
         int fourth = 0;

        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j < n-1; j++) {
                for (int k = 0; k < l; k++) {
                    firstLetter=(char) (97+k);
                    for (int m = 0; m < l; m++) {
                        secondLetter = (char) (97+m);
                        if (first>=second){
                            fourth=first+1;
                        }else if (second>first) {
                            fourth = second + 1;
                        }
                        for (int o = 0; o < n-1; o++) {
                            System.out.printf("%d%d", first , second);
                            System.out.printf("%c%c",firstLetter, secondLetter);
                            System.out.printf("%d ",fourth);
                            if (fourth<=n-1) {
                                fourth++;
                            }else{
                                break;
                            }
                        }
                    }
                }
                second++;
            }
            first++;
            second=1;
            fourth=1;
        }
    }
}
