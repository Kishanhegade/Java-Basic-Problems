package assignment5;

import java.util.Scanner;

public class MagicNumber {
    public static boolean isMagicNumber(int n){
        while(n>9)
        {
            n=sumOfDigits(n);
        }
        return n==1;
    }

    public static int sumOfDigits(int n)
    {
        int sum=0;
        do{
            sum=sum+n%10;
            n=n/10;
        }while (n!=0);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(isMagicNumber(n))
            System.out.println(n+" is a magic number");
        else
            System.out.println(n+" is not a magic number");
    }
}
