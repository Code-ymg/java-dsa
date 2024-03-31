package com.Dsa;
import java.util.Scanner;
public class FuncFact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number you want factorial of -> ");
        int fc = Factorial(in.nextInt());
        System.out.println(fc);
    }
    static int Factorial(int n){
        if(n > 1){
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact = fact * i;
            }return fact;
        }else{
            return 1;
        }
    }
}
