package Loops;

import java.util.Scanner;

public class ProductOfNumbers {
    static int productOfNumbers(int n){
        int prdt = 1;
        int rem = 0;
        while(n>0){
            rem = n% 10;
            prdt*=rem;
            n=n/10;
        }
        return prdt;
    }


}
