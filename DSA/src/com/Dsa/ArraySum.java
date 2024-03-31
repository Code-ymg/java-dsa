package com.Dsa;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array of 5 elements : ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(RunningSum(arr)));
    }
    static int[] RunningSum(int[] nums){
        int n = nums.length;
        int[] Sum = new int[n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                Sum[i] = nums[j] + Sum[i];
            }
        }
        return Sum;
    }
}
