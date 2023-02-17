package org.codewars;

import org.codewars.bitcoinStatistics.Stats;
import org.codewars.goodVsEvil.GoodVsEvil;
import org.codewars.mexicanWave.MexicanWave;
import org.codewars.runLengthEncoding.RunLengthEncoding;
import org.codewars.uniqueNumber.Kata;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Codewars!");

        String encode = RunLengthEncoding.encode("KKKAAAAANNNNNNDDDDDDIIIIIIIUUUUUUKKKKKK");
        System.out.println(encode);
        System.out.println(RunLengthEncoding.decode(encode));

//        System.out.println(GoodVsEvil.battle("8448 6448 7289 619 9043 6719", "6441 9532 4865 1292 1492 4375 9228"));
//        Kata kata = new Kata();
//
//        System.out.println(kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}));

    }
}