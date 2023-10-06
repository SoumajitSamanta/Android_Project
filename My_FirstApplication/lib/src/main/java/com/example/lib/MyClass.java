package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        double division = (float)firstNumber / secondNumber;
        int remainder = (firstNumber % secondNumber);

        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);
    }
}