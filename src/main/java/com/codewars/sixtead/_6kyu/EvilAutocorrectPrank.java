package com.codewars.sixtead._6kyu;

public class EvilAutocorrectPrank {
    public static String autocorrect(String input) {
        return input.replaceAll("(?i)\\b(u|you+)\\b", "your sister");
      }
}