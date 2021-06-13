package com.company.day6.logicalProgramming;
/**
 * Reverse a number
 * In Java, we can reverse a number either by using for loop, while loop, or using recursion.
 * The simplest way to reverse a number is by using for loop or while loop. In order to
 * reverse a number, we have to follow the following steps:
 * a. We need to calculate the remainder of the number using the modulo
 * b. After that, we need to multiply the variable reverse by 10 and add the remainder into
 * it.
 * c. We then divide the number by 10 and repeat steps until the number becomes 0.
 *
 * @author Krunal Lad
 * @version 1.0
 * @since 13-06-2021
 */

import java.util.Scanner;

public class ReverseNumber {

    //main method
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int result = reverseNumber(number);
        System.out.println(result);

    }

    //returns the number in reverse order
    public static int reverseNumber(int number) {

        int reverse = 0;

        while (number != 0) {

            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;

        }

        return reverse;
    }
}
