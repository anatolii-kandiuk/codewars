package org.codewars.helpTheBookseller;

import java.util.*;

public class StockList {

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if(lstOfArt.length== 0 || lstOf1stLetter.length == 0) return "";

        List<String> result = new ArrayList<>();

        for (String letter : lstOf1stLetter) {
            int counter = 0;

            for (String art : lstOfArt) {
                if(art.startsWith(letter)) counter += Integer.parseInt(art.split(" ")[1]);
            }

            result.add("("+letter+" : "+counter+")");
        }

        return String.join(" - ", result);
    }
}
