package com.Dsa;
//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter second number : ");
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println("The first number is larger");
        } else {
            System.out.println("The second number is larger");
        }

    }
}
