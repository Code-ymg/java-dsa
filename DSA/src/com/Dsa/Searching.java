package com.Dsa;
import java.util.Arrays;
import java.util.Scanner;
public class Searching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an 2D array");
        int[][] numbers = new int[5][];
        for(int[] i : numbers){
            for(int j : i){
                numbers[i[j]][j] = in.nextInt();
            }
        }for(int[] i : numbers){
            for(int j : i){
                System.out.println(Arrays.toString(numbers));
            }
        }
    }
}
