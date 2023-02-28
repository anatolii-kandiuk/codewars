package org.codewars.ku4.ObservedPin;

import java.util.*;

public class ObservedPin {

    private static final Map<Character,String> ADJACENTS = new HashMap<>() {{
        put('1', "124");
        put('2', "2135");
        put('3', "326");
        put('4', "4157");
        put('5', "54268");
        put('6', "6953");
        put('7', "748");
        put('8', "87590");
        put('9', "986");
        put('0', "08");
    }};

    public static List<String> getPINs(String observed) {

        List<String> pins = Arrays.asList("");

        for (char c: observed.toCharArray()) {

            List<String> tmp = new ArrayList<>();

            for (char cc: ADJACENTS.get(c).toCharArray())
                for (String s: pins)
                    tmp.add(s+cc);

            pins = tmp;
        }

        return pins;
    }

}