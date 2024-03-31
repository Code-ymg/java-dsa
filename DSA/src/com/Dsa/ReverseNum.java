package com.Dsa;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number you want reverse of -> ");
        int n = in.nextInt();
        while(n > 0){
            int rem = n % 10;
            System.out.print(rem);
            n /= 10;
        }
    }
}
