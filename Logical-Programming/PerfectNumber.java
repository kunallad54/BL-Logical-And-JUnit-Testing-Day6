package com.company.day6.logicalProgramming;
/**
 * Perfect Number
 * a. Just like the Armstrong number, the Perfect Number is also a special type of
 * positive number. When the number is equal to the sum of its positive divisors
 * excluding the number, it is called a Perfect Number. For example, 28 is the perfect
 * number because when we sum the divisors of 28, it will result in the same number.
 * The divisors of 28 are 1, 2, 4, 7, and 14. So,
 * b. 28 = 1+2+4+7
 * c. 28 = 28
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 13-06-2021
 */

import java.util.Scanner;

public class PerfectNumber {

    //returns true if number is Perfect Number else False
    public static boolean isPerfect(int number) {

        boolean flag;
        int sum = 1;

        if (number == 1)
            return false;

        for (int i = 2; i< number; i++) {

            if (number % i == 0)
                sum += i;

        }

        // checking condition sum == number and assigning to the flag -->True or False
        flag = sum == number;

        return flag;
    }

    //Main Method
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        //Calling isPerfect Function if true then its perfect number else not
        if (isPerfect(number))
            System.out.println(number + " is a perfect number");

        else
            System.out.println(number + " is a not perfect number");

    }
}
