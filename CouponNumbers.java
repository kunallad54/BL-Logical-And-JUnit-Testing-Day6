package com.company.day6.logicalProgramming;
/**
 * Coupon Numbers
 * a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
 * need to generate a distinct coupon number? This program simulates this random
 * process.
 * b. I/P -> N Distinct Coupon Number
 * c. Logic -> repeatedly choose a random number and check whether it's a new one.
 * d. O/P -> total random number needed to have all distinct numbers.
 * e. Functions => Write Class Static Functions to generate random numbers and to
 * process distinct coupons.
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 13-06-2021
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CouponNumbers {

    public static void couponGenerator(int range) {

        //array list to store the random numbers generated and to check they are unique
        ArrayList<Integer> arraylist = new ArrayList<>(range);

        int count = 0;

        //generating random numbers till the range
        while (count != range) {

            int randomNumber = ThreadLocalRandom.current().nextInt(0, 10000);

            if (!arraylist.contains(randomNumber)) {

                arraylist.add(randomNumber);
                count++;

            }

        }

        for (int i = 0; i < range; i++)
            System.out.println(arraylist.get(i));

    }

    //main method
    public static void main(String[] args) {

        System.out.println("Enter the number of coupons you want to generate: ");
        Scanner sc = new Scanner(System.in);

        int numberOfCoupons = sc.nextInt();
        System.out.println("The Coupons generated are : ");
        couponGenerator(numberOfCoupons);

    }
}
