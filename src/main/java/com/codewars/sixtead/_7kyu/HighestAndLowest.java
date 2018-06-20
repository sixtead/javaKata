package com.codewars.sixtead._7kyu;

import java.util.Arrays;

public class HighestAndLowest {

    public static String HighAndLow(String numbers) {
        int max = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        int min = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
        return "" + max + " " + min;
      }
}