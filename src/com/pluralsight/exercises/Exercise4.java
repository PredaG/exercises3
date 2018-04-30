/* Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, 
"All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

Test Data
Input first number: 2564
Input second number: 3526
Input third number: 2456*/
package com.pluralsight.exercises;

import java.util.Scanner;


public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();
        System.out.print("Input the third number: ");
        int c = in.nextInt();
        if (a == b && a == c) {
            System.out.println("All numbers are equal");
        } else if ((a == b) || (b == c) || (a == c)) {

            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are equal");

        }
    }
}
