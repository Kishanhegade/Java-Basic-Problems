package Loops;

import java.util.Scanner;

public class SumOfDigits {
    int sumOfDigits(int n){
        int sum = 0;
        int rem = 0;
        while(n>0){
            rem = n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }

}
