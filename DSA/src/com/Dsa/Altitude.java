package com.Dsa;
import java.util.Arrays;
import java.util.Scanner;
public class Altitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ans = new int[5];
        for(int i=0; i<5; i++){
            ans[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(largestAltitude(ans)));
    }
    static int[] largestAltitude(int[] gain) {
        //int ans = 0;
        int n = gain.length;
        int[] alt = new int[n+1];
        for(int i = 1; i < alt.length; i++){
            alt[i] = alt[i-1] + gain[i-1];
        }
        return alt;
    }
}
