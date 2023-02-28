package org.codewars.ku6.bitcoinStatistics;

import java.util.Arrays;

public class Stats {
    public static double[][] getMinAvgMax(int discard, double[][] data) {
        
        double[][] minAvgMaxArray = new double[0][];

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                minAvgMaxArray[i][j] = data[i][discard];
            }
        }

        int i = 0;
        for(double[] el :data) {

            i++;
        }

        return new double[][] {{0.0,0.0,0.0}, {0.0,0.0,0.0}};
    }
}
