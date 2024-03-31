package com.Dsa;

import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.
public class Oddeven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
