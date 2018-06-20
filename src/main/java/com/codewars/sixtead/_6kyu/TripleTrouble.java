package com.codewars.sixtead._6kyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TripleTrouble {

    public static int TripleDouble(long num1, long num2) {
        Pattern p1 = Pattern.compile("(\\d)\\1\\1");
        Matcher m1 = p1.matcher(String.valueOf(num1));
        Pattern p2 = Pattern.compile("(\\d)\\1");
        Matcher m2 = p2.matcher(String.valueOf(num2));

        while (m1.find()) {
            while(m2.find()) {
                if(m1.group().substring(0, 2).equals(m2.group())) return 1;
            }
        }
        return 0;
  }
}