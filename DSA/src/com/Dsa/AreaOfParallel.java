package com.Dsa;
import java.util.Scanner;
public class AreaOfParallel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the breath of the parallelogram -> ");
        int a = in.nextInt();
        System.out.print("Enter the height of the parallelogram -> ");
        int h = in.nextInt();
        int area = a * h;
        System.out.println("The area is -> " +area);
    }
}
