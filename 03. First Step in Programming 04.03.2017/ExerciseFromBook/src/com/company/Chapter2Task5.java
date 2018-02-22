package com.company;

import java.util.Objects;

/**
 * Created by User on 9.3.2017 г..
 */
public class Chapter2Task5 {
    public static void main(String[] args) {

        String wrodOne = "Hello";
        String wordTwo = "World";

        Object combinationOne = wrodOne + wordTwo;

        System.out.println(combinationOne);

        String wordThree = combinationOne.toString();

        System.out.println(wordThree);
    }
}
