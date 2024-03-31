package com.Dsa;
import java.util.Scanner;
public class FunOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number to check if odd-> ");
        boolean num = Odd(in.nextInt());
        System.out.println(num);
    }
    static boolean Odd(int n){
        return n % 2 != 0;
    }
}
