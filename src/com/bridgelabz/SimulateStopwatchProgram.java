package com.bridgelabz;
import java.util.Scanner;
public class SimulateStopwatchProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to start the stopwatch.");
        scanner.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started. Press enter to stop.");
        scanner.nextLine();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
    }
}
