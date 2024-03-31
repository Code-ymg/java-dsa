package com.Dsa;
import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the current reading of units used :- ");
        int crun = in.nextInt();
        System.out.print("Enter the previous reading of units: ");
        int prun = in.nextInt();
        int bill;
        bill = (crun - prun) * 8;
        System.out.println("Bill for this month is -> " + bill);
    }
}
