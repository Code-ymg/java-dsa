package com.Dsa;

import java.util.Scanner;

public class AreaOfRect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length -> ");
        int l = in.nextInt();
        System.out.print("Enter breath -> ");
        int b = in.nextInt();
        int ar = l * b ;
        System.out.println("Area of rectangle -> " + ar + " sq cm");
    }
}
