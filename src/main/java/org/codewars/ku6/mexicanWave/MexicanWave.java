package org.codewars.ku6.mexicanWave;

import java.util.stream.IntStream;

public class MexicanWave {
    public String[] wave(String str) {

        int lenWithoutSpaces = str.replaceAll("\\s","").length();

        String[] waveString = new String[lenWithoutSpaces];

        for (int i = 0, j = 0; i < str.length(); i++, j++) {
            while (Character.toString(str.charAt(i)).equals(" ")) {
                if ((i + 1) >= str.length())
                    return waveString;
                i++;
            }

            StringBuilder sb = new StringBuilder(str);

            sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));

            waveString[j] = sb.toString();
        }

        return waveString;

//        return IntStream
//                .range(0, str.length())
//                .mapToObj(x -> new StringBuilder(str).replace(x, x+1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
//                .filter(x -> !x.equals(str))
//                .toArray(String[]::new);
    }
}
