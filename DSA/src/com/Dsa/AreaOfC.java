package com.Dsa;
import java.util.Scanner;
public class AreaOfC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle in 'cm' -> ");
        float r = in.nextFloat();
        float ar = (float) 3.14 * r * r;
        System.out.print("The area of circle is -> "+ ar + "sq cm");
    }
}
