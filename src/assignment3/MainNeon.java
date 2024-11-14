package assignment3;

import java.util.Scanner;

public class MainNeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        if(isNeon(n))
            System.out.println(n + " is a Neon number");
        else
            System.out.println(n+ " is not a Neon number");
    }

    static boolean isNeon(int x){
        int sum = 0;
        int sqOfNumber = x*x;
        do{
            int d = sqOfNumber%10;
            sum+=d;
            sqOfNumber=sqOfNumber/10;
        }while(sqOfNumber!=0);
        return sum==x;
    }
}
