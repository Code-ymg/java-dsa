package com.Dsa;
import java.util.Arrays;
import java.util.Scanner;
public class PermutationArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int[] inp = buildArray(arr);
        System.out.println(Arrays.toString(inp));
    }
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
