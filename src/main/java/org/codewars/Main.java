package org.codewars;

import org.codewars.areSame.AreSame;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Codewars!");

        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        AreSame areSame = new AreSame();

        System.out.println(areSame.comp(a, b));
    }
}