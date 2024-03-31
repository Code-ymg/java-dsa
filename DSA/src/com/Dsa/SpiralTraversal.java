package com.Dsa;

import java.util.Arrays;

public class SpiralTraversal {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int rStart = 0;
        int cStart = 0;
        int[][] result = spiralTraversal(rows, cols, rStart, cStart);
        for (int i = 0; i < result.length; i++){
            System.out.println(Arrays.toString(result[0]) + " " + Arrays.toString(result[1]));
        }
    }

    static int[][] spiralTraversal(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows*cols][2];
        if (rows <= 0 || cols <= 0) {
            return result;
        }
        int total = rows * cols;
        int count = 0;
        int direction = 0;
        int[][] moves = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int r = rStart;
        int c = cStart;
        while (count < total) {
            result[i++] = new int[]{r, c};
            count++;
            int nextR = r + moves[direction][0];
            int nextC = c + moves[direction][1];
            if (nextR >= 0 && nextR < rows && nextC >= 0 && nextC < cols) {
                r = nextR;
                c = nextC;
            } else {
                direction = (direction + 1) % 4;
            }
        }
        return result;
    }
}