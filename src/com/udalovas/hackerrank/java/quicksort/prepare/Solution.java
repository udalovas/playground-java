package com.udalovas.hackerrank.java.quicksort.prepare;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();

        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> left = new ArrayList();
        List<Integer> right = new ArrayList();
        List<Integer> center = new ArrayList();

        for(int element : array) {
            if(element < array[0]) {
                left.add(element);
            } else if(element > array[0]) {
                right.add(element);
            } else {
                center.add(element);
            }
        }

        for(int element : left) {
            System.out.print(element + " ");
        }

        for(int element : center) {
            System.out.print(element + " ");
        }

        for(int element : right) {
            System.out.print(element + " ");
        }
    }
}