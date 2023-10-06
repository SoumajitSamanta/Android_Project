package com.example.lib;

import java.util.Scanner;

public class ArrayAverage {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int size = scanner.nextInt();

    double array[] = new double[size];
    // declare sum variable, & initialize with 0
    double sum = 0.0;
    // declare average variable
    double avg = 0.0;
    double evn = 0.0;
    // loop to iterate the array
    System.out.println("Enter array elements: ");
    for (int i=0; i<array.length; i++) {
        array[i] = scanner.nextDouble();
        if (i % 2 ==  0){
          evn += array[i];
      }
        sum = sum +evn;
    }
    System.out.println(sum);
    // calculate the average value
    avg = sum/array.length;

    // display result
    System.out.println("Average: " + avg );
  }
}