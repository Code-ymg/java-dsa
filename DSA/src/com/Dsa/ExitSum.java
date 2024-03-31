package com.Dsa;
import java.util.Scanner;
public class ExitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int input;
        System.out.print("Enter any number to start -> ");

        while ((input = in.nextInt()) != 0 ){
            sum += input;
        }
        System.out.println("The sum of every input is -> " + sum);
    }
}
