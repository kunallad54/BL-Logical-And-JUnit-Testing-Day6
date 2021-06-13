package com.company.day6.logicalProgramming;
/**
 * 1. Fibonacci Series
 * Fibonacci series is a special type of series in which the next term is the sum of the
 * previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
 * the next term will be 1(0+1).
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 13-06-2021
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Enter the range: ");
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        fibonacciSeries(range);

    }

    public static void fibonacciSeries(int range) {

        int a = 0, b = 1;
        if (range == 0)
            System.out.println(a);

        int i = 2;
        while (i <= range) {

            int c = a + b;
            a = b;
            b = c;
            System.out.println(b);
            i++;

        }
    }
}
