package assignment7;

import java.util.Scanner;

public class BitwiseOddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();


        if ((num & 1) == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }


        scanner.close();
    }
}
