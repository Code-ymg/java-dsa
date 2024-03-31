package com.Dsa;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to get factors of -> ");
        int num = in.nextInt();
        int i = 1;
        while (num > i) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
