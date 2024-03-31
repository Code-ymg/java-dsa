package com.Dsa;
import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println("num1 is maximum");
            } else {
                System.out.println("num3 is maximum");
            }
        } else {
            if(num2 > num3){
                System.out.println("num2 is maximum");
            } else {
                System.out.println("num3 is maximum");
            }
        }
    }
}
