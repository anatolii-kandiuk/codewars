package org.codewars;

import org.codewars.bitcoinStatistics.Stats;
import org.codewars.mexicanWave.MexicanWave;
import org.codewars.uniqueNumber.Kata;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Codewars!");

        Kata kata = new Kata();

        System.out.println(kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}));

    }
}