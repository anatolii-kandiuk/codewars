package org.codewars;

import org.codewars.kata.Kata;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Codewars!");

        int[] data1= {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
        int[] data2= {0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0};

        System.out.println(Arrays.equals(data2, Kata.DataReverse(data1)));

    }
}