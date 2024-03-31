package com.Dsa;
import java.util.Arrays;
import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = {1, 2, 3, 2, 4, 3, 5};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int repeat = 0;
            int target = nums[i];
            int product = 1;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    repeat++;
                    if(repeat == 1){
                        continue;
                    }else{
                        product = product * nums[j];
                    }
                }else{
                    product = nums[j] * product;
                }
            }
            ans[i] = product;
        }
        return ans;
    }
}
