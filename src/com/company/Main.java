package com.company;

import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int[][] matrixA= new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrixA[i][j] = (int) (Math.random() * 20);
            }
        }
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                total += matrixA[i][j];
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(total);

    }
}
