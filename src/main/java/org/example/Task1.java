package org.example;
//Create a program that uses an array to store a list of temperatures for a week,
// and then uses a loop to find the highest and lowest temperature for the week.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] temp = {67, 60, 78, 66, 48, 80, 68};
        int max = 0;
        int min=0;
        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
            }
        }
        System.out.println("Maximum temperature of the week is "+max);
        min = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (min > temp[i]) {
                min = temp[i];
            }
        }
        System.out.println("Minimum temperature of the week is "+min);
    }
}
