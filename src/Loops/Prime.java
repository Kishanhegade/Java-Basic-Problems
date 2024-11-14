package Loops;

import java.util.Scanner;

public class Prime {
    static int checkPrime(int n){
        int count = 0;
        for(int i=2;i<=n/2;i++){

            if(n%i==0){
                count++;
                break;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =checkPrime(sc.nextInt());
        if(count == 0){
            System.out.println("Prime number");
        }
        else
            System.out.println("Not a prime number");
    }
}
