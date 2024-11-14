package assignment2;

import java.util.Scanner;

public class MainNoOfDigits {

    static int countDigits(int n){
        int count = 0;
        do{
            count++;
            n=n/10;

        }while(n!=0);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int count = countDigits(n);
        System.out.println("No of digits in " + n + " is " + count);
    }
}
