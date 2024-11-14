package Loops;

import java.util.Scanner;

public class PrintFactorialOfEachNum {
    static void accessDigits(int n){
        while(n>0){
            int rem = n%10;
            factorial(rem);
            n = n/10;
        }
    }
    static void factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        accessDigits(sc.nextInt());
    }


}
