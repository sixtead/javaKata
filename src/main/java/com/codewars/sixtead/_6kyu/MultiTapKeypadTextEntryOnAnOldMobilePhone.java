package com.codewars.sixtead._6kyu;

public class MultiTapKeypadTextEntryOnAnOldMobilePhone {
    private static final String[] keypad;
    static {
        keypad = new String[] {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};
            }

    public static int presses(String phrase) {
        int sum = 0;

        for(String symbol : phrase.toUpperCase().split("")) {
            for(String key : keypad) {
                sum += key.indexOf(symbol) + 1;
            }
        }

        return sum;
    }
}