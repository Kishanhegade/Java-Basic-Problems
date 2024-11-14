package assignment4;

import java.util.Scanner;

public class MainPrint4DigitXylem {
    static boolean isXylem(int n){
        int temp=n;
        int exsum=0;
        int msum=0;
        do{
            int d = n%10;
            if(n==temp || n==d){
                exsum+=d;
            }
            else
                msum+=d;
            n=n/10;
        }while(n!=0);
        return exsum==msum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1000;i<=9999;i++){
            if(isXylem(i))
                System.out.print(i+" ");
        }


    }
}
