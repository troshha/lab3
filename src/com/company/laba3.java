package com.company;

import java.util.Arrays;
import java.util.Random;

public class laba3 {
    public static void main(String[] args) {
        float arr1[] = new float[10];
        float arr2[] = new float[10];
        Random rnd = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (rnd.nextBoolean()) ? 1.5f : 2.2f ;
        }
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            int count = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) count++;
            }
            arr2[i] = count;
        }
        System.out.println(Arrays.toString(arr2));
        float[][] array =new float[3][4] ;
        float indexOfMax = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++){
             array[i][j]= (float) (Math.random()*20 );

                if(array[i][j]>indexOfMax){
                    indexOfMax = array[i][j];
                }
            }

            for(float[] a:array){
            for(float b: a)
                System.out.print(b+" ");
                System.out.println();
        }
        System.out.println(indexOfMax);

    }
}
