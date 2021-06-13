package com.company.day6.jUnitTesting;
/**
 * Write Binary.java to read an integer as an Input, convert to Binary using toBinary
 * function and perform the following functions.
 * i. Swap nibbles and find the new number.
 * ii. Find the resultant number is the number is a power of 2.
 * A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
 * Given a byte, swap the two nibbles in it. For example 100 is to be represented as
 * 01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the
 * two nibbles, we get 01000110 which is 70 in decimal.
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 13-06-2021
 */

import java.util.Scanner;

public class SwapNibblesInBinary {

    //main method
    public static void main(String[] args) {

        // range of unsigned byte is from 0 to 255
        int RANGE = 255;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the decimal number between 0 to 255: ");
        int number = sc.nextInt();

        if (number >= 0 && number <= RANGE) {

            System.out.println("The value of " + number + " in binary form is : ");
            decimalToBinaryConverter(number);

        } else
            System.out.println("INVALID INPUT !!! Please enter number between 0 to 255");

    }

    // calculates binary value of the decimal number given
    public static void decimalToBinaryConverter(int n) {

        StringBuffer sb = new StringBuffer();

        while (n != 0) {

            int remainder = n % 2;
            n = n / 2;
            sb.append(remainder);

        }

        System.out.println(sb.reverse());
        binaryToDecimalConverter(sb);
    }

    //swap the nibbles and calculate decimal value of binary number which is generated after swapping
    public static void binaryToDecimalConverter(StringBuffer sb) {

        //adding 0 if length of binary number is less than 8 e.g 7-->111 then --> 0000 0111
        if (sb.length() < 8) {
            while (sb.length() != 8)
                sb.insert(0, 0);
        }
        System.out.println("Binary Number of 8 bits is : " + sb);

        // swapping the first 4 bits and last 4 bits
        String s1 = sb.substring(0, 4);
        String s2 = sb.substring(4);
        String s3 = s2 + s1;
        System.out.println("The value of binary number after swapping the nibbles is : " + s3);

        //binary to decimal converter
        int decimalToBinary = Integer.parseInt(s3, 2);
        System.out.println("The decimal number after swapping nibbles is : " + decimalToBinary);

    }
}
