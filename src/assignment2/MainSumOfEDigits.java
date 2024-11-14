package assignment2;

import java.util.Scanner;

public class MainSumOfEDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int sum = sumOfEDigits(n);
        System.out.println("Sum of even digits in "+n+" is "+ sum);
    }
    static int sumOfEDigits(int n){
        int sum = 0;
        do{
            int d = n%10;
            if(d%2==0)
                sum+=d;
            n=n/10;
        }while(n!=0);
        return sum;
    }
}
