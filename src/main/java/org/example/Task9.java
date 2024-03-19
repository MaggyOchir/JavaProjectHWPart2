package org.example;

//Write a java program to find the second largest number in the array?
public class Task9 {
    public static void main(String[] args) {
        int[] num = {100, 33, 2, 4, 66, 55, 88, 7, 9,};
        int max = num[0];
        int max1 = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max > num[i]) {
                max1 = max;
                max = num[i];
            } else if (max > num[i] && num[i] > max1){
                max1=num[i];
            }
        }
        System.out.println("Second max number of this array is " + max1);
    }
}


