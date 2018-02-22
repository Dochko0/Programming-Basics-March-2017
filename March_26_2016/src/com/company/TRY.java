package com.company;

/**
 * Created by User on 31.3.2017 г..
 */
public class TRY {
    public static void main(String[] args) {
        //char[] alpha = new char[26];
        char al = 0;
        int k = 0;
        for(int i = 0; i < 3; i++){
            al = (char) (97+i);
            //alpha[i]= (char) (97+i);
            //alpha[i] = (char)(97 + (k++));
            System.out.print(al);
        }
    }
}
