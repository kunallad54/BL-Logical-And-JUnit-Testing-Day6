package com.company.day6.jUnitTesting;
/**
 * Find the Fewest Notes to be returned for Vending Machine
 * a. Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
 * returned by Vending Machine. Write a Program to calculate the minimum number
 * of Notes as well as the Notes to be returned by the Vending Machine as a
 * Change
 * b. I/P -> read the Change in Rs to be returned by the Vending Machine
 * c. Logic -> Use Recursion and check for largest value of the Note to return change
 * to get to the minimum number of Notes.
 * d. O/P -> Two Outputs - one the number of minimum Note needed to give the
 * change and second list of Rs Notes that would given in the Change
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 13-06-2021
 */

import java.util.Scanner;

public class VendingMachine {

    //array of different notes available in Vending Machine
    static int[] notes = new int[]{1000, 500, 100, 50, 10, 5, 2, 1};
    static int i;

    //for counting the notes
    static int[] notesCounter = new int[8];
    static int totalNotes = 0;

    //main method
    public static void main(String[] args) {
        System.out.println("Enter the amount : ");
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        moneyCalculator(amount);
    }

    //Calculates minimum number of notes
    public static void moneyCalculator(int amount) {

        for (i = 0; i < notes.length; i++) {

            if (amount >= notes[i]) {

                //Counting the currency count
                notesCounter[i] = amount / notes[i];//---->Amount=5521 /notes[0]=1000 = 5
                amount %= notes[i];                 //----> 5521 % 1000 --> 521---> amount = 521
                totalNotes += notesCounter[i];      // ---->total notes = 5;
                moneyCalculator(amount);            // ----> recursive calling the function and loops runs
                return;

            }

            if (amount == 0)
                break;

        }

        System.out.println("The minimum number of notes required to give the amount is : " + totalNotes);
        System.out.println("Currency Count is : ");

        for (i = 0; i < notesCounter.length; i++) {

            if (notesCounter[i] != 0)
                System.out.println(notes[i] + " : " + notesCounter[i]);

        }

    }
}
