package assignment3;

import java.util.Scanner;

public class AlternatePrime {
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                if (count % 2 == 0) {
                    System.out.println(i);
                }
                count++;
            }
        }
    }
}
