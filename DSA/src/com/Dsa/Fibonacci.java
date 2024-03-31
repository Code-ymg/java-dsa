package com.Dsa;
//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number up to which you want series of : ");
        int count = 2;
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        while(count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.print("The n th Fibonacci number is -> "+ b);
    }
}
