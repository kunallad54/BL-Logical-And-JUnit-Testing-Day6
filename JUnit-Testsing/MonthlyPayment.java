package com.company.day6.jUnitTesting;
/**
 * Write a Util Static Function to calculate monthlyPayment that reads in three
 * command-line arguments P, Y, and R and calculates the monthly payments you
 * would have to make over Y years to pay off a P principal loan amount at R per cent
 * interest compounded monthly.
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 13-06-2021
 */

import java.util.Scanner;

public class MonthlyPayment {

    //main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal Amount : ");
        double principalAmount = sc.nextDouble();

        System.out.println("Enter the number of Years : ");
        double numberOfYears = sc.nextDouble();

        System.out.println("Enter the rate of interest : ");
        double rateOfInterest = sc.nextDouble();

        double amount = monthlyPayment(principalAmount, numberOfYears, rateOfInterest);
        System.out.println("The monthly payment is of Rs " + amount + " /-");
    }

    // returns monthly payment to pay for 'y' years
    public static double monthlyPayment(double p, double y, double R) {

        //formula for compounding the monthly amount
        double n = 12 * y;
        double r = R / (12 * 100);
        double payment = (p * r) / (1 - Math.pow(1 + r, -n));

        return payment;
    }
}
