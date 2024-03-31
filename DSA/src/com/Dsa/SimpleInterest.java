package com.Dsa;
import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle amount : ");
        float pir = in.nextFloat();
        System.out.print("Enter the time period : ");
        float tm = in.nextFloat();
        System.out.print("Enter the interest rate : ");
        float rte = in.nextFloat();

        float Amt = pir*(1 + ((rte/100)*tm));
        System.out.print("The amount you have to pay is "+ Amt);
    }
}
