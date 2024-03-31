package com.Dsa;
import java.util.Scanner;
public class AvgN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers up to which you want average of->");
        float num = in.nextFloat();
        float sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = i + sum;
        }
        float avg = sum / num;
        System.out.println("The average is -> " +avg);
    }
}
