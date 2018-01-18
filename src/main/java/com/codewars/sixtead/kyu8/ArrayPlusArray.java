package com.codewars.sixtead.kyu8;

class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;

        for(int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            sum += arr2[i];
        }

        return sum;
    }
}