package com.Dsa;
import java.util.Scanner;
public class AreaOfT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the triangle-> ");
        int h = in.nextInt();
        System.out.print("Enter the base length of the triangle-> ");
        int b = in.nextInt();
        int ar = (b * h) / 2;
        System.out.println("The area of triangle is-> " + ar + " sq cm");
    }
}
