package com.Dsa;
import java.util.Scanner;
public class FuncMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks -> ");
        String marks = Grade(in.nextInt());
        System.out.println(marks);
    }
    static String Grade(int n){
        if (n > 91 && n < 100){
            return "AA";
        } else if (n > 81 && n < 90) {
            return "AB";
        } else if (n > 71 && n < 80) {
            return "BB";
        } else if (n > 61 && n < 70) {
            return "BC";
        } else if (n > 51 && n < 60) {
            return "CD";
        } else if (n > 41 && n < 50) {
            return "DD";
        }else{
            return "FAIL";
        }
    }
}
