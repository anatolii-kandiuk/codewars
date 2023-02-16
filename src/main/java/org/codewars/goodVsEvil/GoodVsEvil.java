package org.codewars.goodVsEvil;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        int[] goodWarriorValue = new int[] {
                1, // Hobbits
                2, // Men
                3, // Elves
                3, // Dwarves
                4, // Eagles
                10 // Wizards
        };
        int[] evilWarriorValue = new int[] {
                1, // Orcs
                2, // Men
                2, // Wargs
                2, // Goblin
                3, // Uruk Hai
                5, // Trolls
                10 // Wizards
        };

        int[] goodWarriors = Arrays.stream(goodAmounts.split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        int[] evilWarriors = Arrays.stream(evilAmounts.split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        int goodCounter = IntStream.rangeClosed(0, goodWarriors.length-1)
                .map(i -> goodWarriors[i] * goodWarriorValue[i])
                .sum();

        int evilCounter = IntStream.rangeClosed(0, evilWarriors.length-1)
                .map(i -> evilWarriors[i] * evilWarriorValue[i])
                .sum();

//        int goodCounter = 0;
//
//        int evilCounter = 0;
//
//        for(int i = 0; i < goodWarriors.length; i++) {
//            goodCounter += goodWarriors[i] * goodWarriorValue[i];
//        }
//
//        for(int i = 0; i < evilWarriors.length; i++) {
//            evilCounter += evilWarriors[i] * evilWarriorValue[i];
//        }

        return goodCounter > evilCounter ? "Battle Result: Good triumphs over Evil" :
                goodCounter < evilCounter ? "Battle Result: Evil eradicates all trace of Good" :
                        "Battle Result: No victor on this battle field";
    }
}
