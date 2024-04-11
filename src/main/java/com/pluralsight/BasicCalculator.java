package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //While loop so calculator keeps running until (q)uit
        boolean calculator = true;
        while (calculator) {
        //Enter first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println();
        //Enter second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println();
        //Print possible calculation options
        System.out.println("Possible Calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        //Enter calculation option
        System.out.print("Please select an option: ");
        char option = scanner.next().charAt(0);
        System.out.println();

        //Switch case for possible calculations
        switch (option) {
            case 'A':
                System.out.println(num1 + num2);
                break;
            case 'S':
                System.out.println(num1 - num2);
                break;
            case 'M':
                System.out.println(num1 * num2);
                break;
            case 'D':
                System.out.println(num1 / num2);
                break;
            case 'q':
                calculator = false;
            default:
                System.out.println("Invalid option");
                break;
        }
        }

    }
}
