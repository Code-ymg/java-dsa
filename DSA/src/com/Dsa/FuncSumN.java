package com.Dsa;
import java.util.Scanner;
public class FuncSumN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number you want addition of-> ");
        int s = SumN(in.nextInt());
        System.out.println(s);
    }
    static int SumN(int num){
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
