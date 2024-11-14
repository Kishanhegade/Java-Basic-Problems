package assignment7;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press '1' and hit Enter to start the stopwatch: ");
        int startInput = scanner.nextInt();
        if (startInput == 1) {
            long startTime = System.currentTimeMillis();
            System.out.println("Stopwatch started...");
            System.out.println("Press '2' and hit Enter to stop the stopwatch: ");
            int stopInput = scanner.nextInt();

            if (stopInput == 2) {
                long endTime = System.currentTimeMillis();
                long elapsedTime = endTime - startTime;
                long elapsedSeconds = elapsedTime / 1000;
                long elapsedMilliseconds = elapsedTime % 1000;
                System.out.println("Stopwatch stopped.");
                System.out.println("Elapsed time: " + elapsedSeconds + " seconds and " + elapsedMilliseconds + " milliseconds.");
            } else {
                System.out.println("Invalid input for stopping the stopwatch.");
            }
        } else {
            System.out.println("Invalid input for starting the stopwatch.");
        }
        scanner.close();
    }
}
