package com.zza.jianzhiOffer.no16;

import java.util.ArrayList;
import java.util.Arrays;

public class Test16 {
    public static void main(String[] args) {
        int[][] a = new int[3][2];

        printMatrix(a);
    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int row = 0;
        int col = 0;
        int up = 0;
        int left = 1;
        int i = 10;
        while (i<10){
            arrayList.add(matrix[row][col]);
           if (left == 1 && col<matrix[0].length){
               col++;
           }
           if (left == 1 && col==matrix[0].length-1){
               left = 0;
               up = -1;
               row ++;
           }
           if (left == -1 && col>0){
               col --;
           }
           if (left == -1 && col == 0){
               up = 1;
               left = 0;
               row --;
           }
           if (up == 1 && row>0){
               col--;
           }
           if (up == 1 && row ==0){

           }
           if (up == -1 && row<matrix[0].length){
               col++;
           }

        }
        return arrayList;
    }
}
