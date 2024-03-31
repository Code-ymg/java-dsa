package com.Dsa;
import java.util.Scanner;
public class AreaOfIsoT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side which is equal -> ");
        double a = in.nextDouble();
        System.out.print("Enter the other side -> ");
        double b = in.nextDouble();
        double ar = 0.5*Math.sqrt((a*a) - (b*b/4))*b;
        System.out.println("The area of triangle is -> " + ar +" sq cm");
    }
}
