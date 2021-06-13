package com.company.day6.logicalProgramming;
/**
 * Simulate Stopwatch Program
 * a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
 * the start and end clicks
 * b. I/P -> Start the Stopwatch and End the Stopwatch
 * c. Logic -> Measure the elapsed time between start and end
 * d. O/P -> Print the elapsed time.
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 13-06-2021
 */

import java.util.Scanner;


public class StopwatchSimulation {

    public static Scanner sc = new Scanner(System.in);
    public static int START = 0;
    public static int STOP = 0;

    public static void main(String[] args) {

        System.out.println("Welcome  to StopWatch Simulation Program ");
        timerInMilliSeconds();

    }

    public static void timerInMilliSeconds() {

        long startTime = 0;
        long endTime = 0;

        System.out.println("Press 0 to start the time : ");
        int startInput = sc.nextInt();

        if (startInput == START)
            startTime = System.nanoTime();

        System.out.println("Press 1 to stop the time : ");
        int endInput = sc.nextInt();

        if (endInput == STOP)
            endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        System.out.println("Time elapsed is : " + timeElapsed + " milliseconds");
    }
}
