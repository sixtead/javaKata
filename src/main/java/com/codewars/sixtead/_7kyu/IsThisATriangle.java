package com.codewars.sixtead._7kyu;

public class IsThisATriangle {
    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}