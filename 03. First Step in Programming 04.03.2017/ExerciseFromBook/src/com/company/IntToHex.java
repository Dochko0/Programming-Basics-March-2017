package com.company;

/**
 * Created by User on 8.3.2017 г..
 */
public class IntToHex {
    public static void main(String[] args) {
        int number = 256;

        String str = Integer.toHexString(number);
        System.out.println(str);
    }
}
