package org.codewars;

import org.codewars.kata.Kata;
import org.codewars.mexicanWave.MexicanWave;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Codewars!");

        MexicanWave mexicanWave = new MexicanWave();

        System.out.println(Arrays.toString(mexicanWave.wave(" hello codewars ")));
    }
}