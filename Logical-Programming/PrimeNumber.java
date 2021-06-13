package com.company.day6.logicalProgramming;
/**
 * Prime Number
 * Just like the Perfect number, the Prime number is also a special type of number. When
 * the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
 * number. 0 and 1 are not counted as prime numbers. All the even numbers can be
 * divided by 2, so 2 is the only even prime minister.
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 13-06-2021
 */

import java.util.Scanner;

public class PrimeNumber {

    //if prime number returns true
    public static boolean isPrime(int number) {

        //assigning boolean value true if number > 1 else if number is less than 1 then false
        boolean flag = number > 1;

        int i = 2;

        while (i <= number / 2) {

            if (number % i == 0) {

                flag = false;
                break;

            }

            i++;
        }
        return flag;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (isPrime(number))
            System.out.println(number + " is a prime number");

        else
            System.out.println(number + " is not a prime number");
    }
}
