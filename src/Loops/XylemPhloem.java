package Loops;

import java.util.Comparator;
import java.util.Scanner;

public class XylemPhloem {
    static void xylemPhloem(int n){
        int sum1= n%10;
        n=n/10;
        int sum2 = n%10;
        n=n/10;
        while(n>10){
            int rem = n%10;
            sum2+=rem;
            n = n/10;
        }
        sum1+=n;
        System.out.println("Sum of first and last digit is :" + sum1);
        System.out.println("Sum of remaining digits is: "+ sum2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        xylemPhloem(scanner.nextInt());
    }
}
