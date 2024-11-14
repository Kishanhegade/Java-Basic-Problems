package assignment7;

import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int result = num << 1; // Left shifting by 1 bit multiplies the number by 2

        System.out.println(num + " multiplied by 2 using left shift is: " + result);

        scanner.close();
    }
}
