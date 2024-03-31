package com.Dsa;
import java.util.Scanner;
public class FuncPythagoras {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a pythagorian triplet -> ");
        int su1 = in.nextInt();
        int su2 = in.nextInt();
        int su3 = in.nextInt();
        String ans = Triplet(su1, su2, su3);
        System.out.println(ans);
    }
    static String Triplet(int num1 ,int num2 ,int num3){
        int m1 = Math.max(Math.max(num1 ,num2) ,num3);
        int m2 = Math.min(Math.min(num1 ,num2) ,num3);
        int m3 = num1 + num2 + num3 - (m1 + m2);

        if((m1 * m1) == (m2 * m2) + (m3 * m3)){
            return "It's a Pythagorian triplet";
        }else{
            return "It's not a Pythagorian triplet";
        }
    }
}
