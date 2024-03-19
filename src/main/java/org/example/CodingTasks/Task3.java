package org.example.CodingTasks;

//Create a 2D array or integer type where you will store odd and even numbers.
// Develop a program which will identify/print the even numbers only.
public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 45, 3, 7, 67},
                {23, 4, 9, 5, 7}};
        System.out.print("even numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(+numbers[i][j] + " ");
                    }
                }
            }

            }}










