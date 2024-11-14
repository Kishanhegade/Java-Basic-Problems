package assignment3;

import java.util.Scanner;

public class MainArmstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        if(isArmstrong(n))
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
    static boolean isArmstrong(int x){
        int temp = x;
        int sum = 0;
        int noOfDigits = getCount(x);
        do{
            int digit = x%10;
            sum = sum + getPow(digit,noOfDigits);
            x=x/10;
        }while(x!=0);
        return sum == temp;
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
