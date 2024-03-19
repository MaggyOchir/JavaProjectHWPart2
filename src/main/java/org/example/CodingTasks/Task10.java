package org.example.CodingTasks;

//Write a program to print out duplicate elements from an Array of Strings?
public class Task10 {
    public static void main(String[] args) {
        String[] duplicate = {"Mazda", "Toyota", "Nissan", "Mazda", "Jeep"};
        for (int i = 0; i < duplicate.length; i++) {
            for (int j = i + 1; j < duplicate.length; j++) {
                if (duplicate[i] == duplicate[j]) {

                    System.out.print("Duplicate name of the cars is " + duplicate[i]);
                }
            }
        }
    }
}