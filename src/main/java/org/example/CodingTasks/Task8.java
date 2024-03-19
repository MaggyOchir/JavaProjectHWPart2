package org.example.CodingTasks;

//Maximum and minimum number in the array?
public class Task8 {
    public static void main(String[] args) {
        int[]numbers={100,33,2,4,66,55,88,7,9,};
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0; i<numbers.length;i++){
            if(max<numbers[i]){
            max=numbers[i];}
               else if(min>numbers[i]){
                min=numbers[i];}}
     System.out.println("Max num is "+max);
        System.out.print("Min num is "+min);
    }
        }