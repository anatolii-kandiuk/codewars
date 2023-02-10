package org.codewars.xbonacci;

import java.util.Arrays;
import java.util.stream.Stream;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {

        if(s == null || s.length < 3) return null;

        double[] tribonacciArray = new double[n];

        for (int i = 0; i < n; i++) {
            if (i < s.length) tribonacciArray[i] = s[i];
            else tribonacciArray[i] = tribonacciArray[i - 1] + tribonacciArray[i - 2] + tribonacciArray[i - 3];
        }

        return tribonacciArray;

        // Use Arrays
//        double[] tritab = Arrays.copyOf(s, n);
//
//        for(int i = 3; i < n; i++) {
//            tritab[i] = tritab[i-1] + tritab[i-2] + tritab[i-3];
//        }
//        return tritab;

        // Use stream
        // return Stream.iterate(s, p -> new double[]{p[1], p[2], p[0] + p[1] + p[2]}).limit(n).mapToDouble(p -> p[0]).toArray();
    }

}
