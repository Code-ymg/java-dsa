package com.Dsa;
import java.util.Scanner;
//Input currency in rupees and output in USD.
public class INDtoUSD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in Rupees : ");
        float ind = in.nextFloat();
        float usd = (float) (ind * 0.0120628);
        System.out.print("The amount in USD is -> "+ usd);
    }
}
