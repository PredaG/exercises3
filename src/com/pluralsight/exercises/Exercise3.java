package com.pluralsight.exercises;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fharenheit = ((9 * celsius + (32 * 5)) / 5);
        System.out.println(celsius + " degree in Celsius is equal to " + fharenheit + "in Fharenheit");
    }
}
