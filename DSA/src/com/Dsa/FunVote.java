package com.Dsa;
import java.util.Scanner;
public class FunVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age to check eligibility -> ");
        String el = Vote(in.nextInt());
        System.out.println(el);
    }
    static String Vote(int n){
        if(n > 18){
            return "Can vote";
        }else{
            return "Cannot vote";
        }
    }
}
