package assignment3;

import java.util.Scanner;

public class MainDisarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        if(isDisarium(n))
            System.out.println(n + " is a Disarium number");
        else
            System.out.println(n + " is not a Disarium number");
    }

    static boolean isDisarium(int n){
        int temp = n;
        int noOfDigits = getCount(n);
        int sum = 0;
        do{
            int digit = n%10;
            sum+=getPow(digit,noOfDigits);
            n=n/10;
            noOfDigits--;
        }while (n!=0);
        return sum==temp;
    }
    static int getCount(int n){
        int countDigit = 0;
        do{
            countDigit++;
            n=n/10;
        }while(n!=0);
        return countDigit;
    }

    static int getPow(int b,int ex){
        int res = 1;
        while(ex>0){
            res = res * b;
            ex--;
        }
        return res;
    }
}
