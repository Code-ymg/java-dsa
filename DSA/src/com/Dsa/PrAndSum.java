package com.Dsa;
//Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;
public class PrAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number -> ");
        int num = in.nextInt();
        int s = num;
        int p = num;
        int sum = 0;
        int prd = 1;

        while(s > 0){
            int rem = s % 10;
            sum = rem + sum;
            s = s / 10;
        }

        while(p > 0){
            int rem = p % 10;
            prd = rem * prd;
            p = p / 10;
        }

        int ans = prd - sum;
        System.out.println("The answer is -> " + ans);
    }
}
