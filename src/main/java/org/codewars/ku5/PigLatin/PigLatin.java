package org.codewars.ku5.PigLatin;

import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {

//        if (str == null || str.length() == 0) {
//            return null;
//        }
//
//        final String[] words = str.split("\\s");
//        final StringBuilder sb = new StringBuilder();
//
//        for (String s : words) {
//            if (Pattern.matches("\\p{IsPunctuation}", s)) {
//                sb.append(s).append(" ");
//            } else {
//                sb.append(s.substring(1))
//                        .append(s.charAt(0))
//                        .append("ay ");
//            }
//        }
//
//        while (sb.charAt(sb.length() - 1) == ' ') {
//            sb.setLength(sb.length() - 1);
//        }
//
//        return new String(sb);

        return str != null ? str.replaceAll("(\\w{1})(\\w*)", "$2$1ay") : "Str is null";
    }
}
