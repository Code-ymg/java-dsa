package com.Dsa;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want factorial of -> ");
        int num = in.nextInt();
        int fact = 1;

        for (int i = 2; i < num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }
}
