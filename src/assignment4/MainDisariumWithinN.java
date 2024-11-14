package assignment4;

import java.util.Scanner;

public class MainDisariumWithinN {
    static int getCount(int n){
        int count = 0;
        do{
            n=n/10;
            count++;
        }while(n!=0);
        return count;
    }
    static boolean isDisarium(int x){
        int temp=x;
        int noOfDigits = getCount(x);
        int sum = 0;
        do{
            int d = x%10;
            sum+=getPow(d,noOfDigits);
            x/=10;
            noOfDigits--;
        }while(x!=0);
        return sum==temp;
    }
    static int getPow(int n,int p){
        int res = 1;
        for(int i = 1;i<=p;i++){
            res = res*n;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(isDisarium(i)){
                System.out.print(i + " ");
            }
        }
    }
}
