package com.company.day6.jUnitTesting;
/**
 * Write a static function sqrt to compute the square root of a nonnegative number c
 * given in the input using Newton's method:
 * - initialize t = c
 * - replace t with the average of c/t and t
 * - repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t
 * where epsilon = 1e-15;
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 13-06-2021
 */

import java.util.Scanner;

public class NewtonsSquareRoot {

    //main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        double num = sc.nextDouble();
        double epsilon = 0.00001;

        double sqrtOfNumber = sqrtUsingNewton(num, epsilon);
        System.out.println("The square root of the number is : " + sqrtOfNumber);

    }

    // returns absolute or approximate square root of number
    public static double sqrtUsingNewton(double c, double l) {

        double t = c;
        double root;

        //formula to calculate roots
        while (true) {

            root = 0.5 * (t + (c / t));

            if (Math.abs(root - t) < l)
                break;
            t = root;

        }

        return root;
    }
}
