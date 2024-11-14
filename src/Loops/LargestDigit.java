package Loops;

import java.util.Scanner;

public class LargestDigit {
    static void largestDigit(int n){
        int largest = 0;
        int rem =0;
        while(n>0){
            rem = n%10;
            if(rem > largest){
                largest = rem;
            }
            n = n/10;
        }
        System.out.println(largest);
    }
    static void smallestDigit(int n){
        int smallest = n%10;
        int rem =0;
        while(n>0){
            rem = n%10;
            if(rem<smallest){
                smallest = rem;
            }
            n =  n/10;
        }
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        largestDigit(sc.nextInt());
        smallestDigit(sc.nextInt());
    }
}
