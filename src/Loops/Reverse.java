package Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int m = 0;
        int rem = 0;
        while(n>0){
            rem = n%10;
            m = m*10 + rem;
            n=n/10;
        }
        if(m==num){
            System.out.println(num + " a palindrome number");
        }
        else
            System.out.println(num +" is not a palindrome number");
    }
}

