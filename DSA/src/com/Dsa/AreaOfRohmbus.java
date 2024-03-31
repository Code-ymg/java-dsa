package com.Dsa;
import java.util.Scanner;
public class AreaOfRohmbus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of diagonal 'd1' -> ");
        float d1 = in.nextFloat();
        System.out.print("Enter the length of diagonal 'd2' -> ");
        float d2 = in.nextFloat();
        float area = (float) 0.5 * d1 * d2;
        System.out.println("The area of Rohmbus is -> " + area);
    }
}
