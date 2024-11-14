package assignment4;

import java.util.Scanner;

public class FirstNHappy {
    static boolean isHappy(int n){
        while(n>9){
            n = sumSqOfDigits(n);
        }
        return n==1|| n==7;
    }
    static int sumSqOfDigits(int x){
        int sum = 0;
        do{
            int d = x%10;
            sum+=d*d;
            x=x/10;
        }while(x!=0);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; count<n;i++){
            if(isHappy(i)){
                System.out.print(i+" ");
                count++;
            }
        }
    }
}
