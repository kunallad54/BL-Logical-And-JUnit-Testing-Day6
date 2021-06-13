package com.company.day6.jUnitTesting;
/**
 * Write a static function toBinary that outputs the binary (base 2) representation of
 * the decimal number typed as the input. It is based on decomposing the number into
 * a sum of powers of 2. For example, the binary representation of 106 is 11010102,
 * which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding
 * to represent 4 Byte String.
 * To compute the binary representation of n, we consider the powers of 2 less than or
 * equal to n in decreasing order to determine which belong in the binary
 * decomposition (and therefore correspond to a 1 bit in the binary representation).
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 13-06-2021
 */

import java.util.Scanner;

public class DecimalToBinary {

    //main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int number = sc.nextInt();

        System.out.println("The number " + number + " in binary form is : ");
        decimalToBinaryConverter(number);

    }

    //calculates a binary value of the decimal number given as input
    public static void decimalToBinaryConverter(int n) {

        StringBuffer sb = new StringBuffer();

        while (n != 0) {

            int remainder = n % 2;
            n = n / 2;
            sb.append(remainder);

        }

        System.out.println(sb.reverse());

    }
}
