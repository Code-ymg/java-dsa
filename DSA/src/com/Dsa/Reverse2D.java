package com.Dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] reverse = new int[3];
        for(int i = 0; i < reverse.length; i++){
            reverse[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(reverse));
    }
    static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr ,start ,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
