package com.Dsa;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int num = in.nextInt();
        int arm = 0;
        int c = num;
        while (num > 0) {
            int r = num % 10;
            arm = (r * r * r) + arm;
            num = num / 10;
        }
        if (arm == c) {
            System.out.println("The number is a armstrong number");
        } else {
            System.out.println("The number is not a armstrong number");
        }
    }
}
