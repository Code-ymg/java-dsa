package com.Dsa;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original price : ");
        float or = in.nextFloat();
        System.out.print("Enter the percentage of discount : ");
        float dis = in.nextFloat();

        float dispr = or * (dis / 100);
        float finpr = or - dispr;
        System.out.println("The final discounted price is : "+finpr);


    }
}
