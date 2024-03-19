package org.example;

//Write a java program to check whether a given number is prime or not?
public class Task6 {
    public static void main(String[] args) {
        int num =11;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");

        }
    }


}













