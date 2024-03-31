package com.Dsa;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float ans = 0;
        while (true) {
            System.out.print("Enter a operator : ");
            char op = in.next().trim().charAt(0);
            //TO take input from user
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                float num1 = in.nextFloat();
                float num2 = in.nextFloat();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if (num2 == 0){
                        System.out.println("Not possible");
                    }else{
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }else if(op=='x' ||  op=='X'){
                break;
            }else{
                System.out.println("Enter valid operator");
            }
           System.out.println(ans);
        }
    }
}
