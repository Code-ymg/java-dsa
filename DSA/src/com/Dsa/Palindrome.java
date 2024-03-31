package com.Dsa;
import java.util.Scanner;
//To find out whether the given String is Palindrome or not.
public class Palindrome {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a string to check : ");
       String str = in.next();
        if (palindrome(str)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("This string is not a palindrome");
        }
    }
    public static boolean palindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}