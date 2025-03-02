package com.Dsa;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] ans = {9};
        System.out.println(Arrays.toString(plusOne(ans)));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArr = new int[n+1];
        newArr[0] = 1;
        return newArr;
    }
}
