package assignment3;

import java.util.Scanner;

public class MainHappy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        if(isHappy(n))
            System.out.println(n + " is a Happy  number");
        else
            System.out.println(n + " is not a Happy number");
    }
    static boolean isHappy(int n){
        int sum = n;
        while(sum!=1 && sum!=4){
            sum = sumSqOfDigit(sum);
        }
        return sum == 1;

    }
    static int sumSqOfDigit(int x){
        int sum = 0;
        do{
            int d = x%10;
            sum+=d*d;
            x=x/10;
        }while(x!=0);
        return sum;
    }
}
