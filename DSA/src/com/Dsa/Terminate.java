package com.Dsa;
import java.util.Scanner;
public class Terminate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number you want positive or negative(enter 0 exit) : ");
        int input;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        while ((input = in.nextInt()) != 0) {
            if (input < 0) {
                sum1 = input + sum1;
            } else {
                if (input % 2 == 0) {
                    sum2 = input + sum2;
                } else {
                    sum3 = input + sum3;
                }
            }
        }
        System.out.println("The sum of the negative integer is -> "+sum1);
        System.out.println("The sum of the even positive integer is -> "+sum2);
        System.out.println("The sum of the odd positive integer is -> "+sum3);
    }
}
