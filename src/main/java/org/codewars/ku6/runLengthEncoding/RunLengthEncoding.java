package org.codewars.ku6.runLengthEncoding;

import static java.util.regex.Pattern.compile;

public class RunLengthEncoding {
    public static String encode(String input) {

        StringBuilder encodeData = new StringBuilder();

        int counterLetter = 1;

        for(int i = 0; i < input.length(); i++) {

            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i+1)) {
                counterLetter++;
                i++;
            }
            encodeData.append(counterLetter).append(input.charAt(i));
            counterLetter = 1;
        }

        return encodeData.toString();

        //  return compile("(.)\\1*").matcher(input).replaceAll(m -> m.end() - m.start() + m.group(1));
    }

    public static String decode(String input) {

        String[] decodeArray;

        String regex = "(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)";

        decodeArray = input.split(regex);

        for(int i = 1; i < decodeArray.length; i += 2) {
            decodeArray[i] = decodeArray[i].repeat(Integer.parseInt(decodeArray[i-1]));
            decodeArray[i-1] = "";
        }

        return String.join("",  decodeArray);

        //  return compile("(\\d+)(\\D)").matcher(input).replaceAll(m -> m.group(2).repeat(Integer.parseInt(m.group(1))));
    }
}
