package com.Dsa;
import java.util.Scanner;
public class FuncPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number to check if it's prime-> ");
        boolean n = isPrime(in.nextInt());
        System.out.println(n);
//        for (int i = 2; i < 500; i++) {
//            if(isPrime(i)){
//                System.out.print(i + " ");
//            }
//        }
    }
    static boolean isPrime(int n){
        int c = 2;
        while( c < n){
            if(n % c == 0){
                return false;
            }c++;
        }return true;
    }
}
