package assignment7;

import java.util.Scanner;

public class BitwiseRightShift {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();


        int result = num >> 1; // Right shifting by 1 bit divides the number by 2

        // Display the result
        System.out.println(num + " divided by 2 using right shift is: " + result);

        // Close the scanner
        scanner.close();
    }
}
