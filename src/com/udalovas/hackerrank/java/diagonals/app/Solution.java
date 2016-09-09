package com.udalovas.hackerrank.java.diagonals.app;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int N = scanner.nextInt();

        int[][] array = new int[N][N];

        for (int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int leftToRightSum = 0;
        int rightToLeftSum = 0;

        int i = 0, j = 0;
        while(i < N && j < N) {
            leftToRightSum += array[i++][j++];
        }

        i = N - 1;
        j = 0;

        while(i >= 0 && j < N) {
            rightToLeftSum += array[i--][j++];
        }

        System.out.println(Math.abs(rightToLeftSum - leftToRightSum));
    }


}