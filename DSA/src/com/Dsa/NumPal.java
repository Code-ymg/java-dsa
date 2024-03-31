package com.Dsa;
import java.util.Scanner;
public class NumPal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number to check -> ");
        String n = Pal(in.nextInt());
        System.out.println(n);
    }
    static String Pal(int num){
        int temp = 0;
        int i = num;
       while (num > 0){
           int rem = num % 10;
           temp = (temp * 10) + rem;
           num = num / 10;
       }
       if(temp == i){
           return "It's a palindrome";
       }else{
           return "It's not a palindrome";
       }
    }
}
