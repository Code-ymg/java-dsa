package com.Dsa;
import java.util.Scanner;
public class CelciusToFr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter temperature in C: ");
        float tempc = in.nextFloat();
        float tempf = (tempc * 9/5) + 32;
        System.out.println("The temperature in ferhanite is :" + tempf);
    }
}
