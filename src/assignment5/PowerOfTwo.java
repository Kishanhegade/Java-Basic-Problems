package assignment5;

import java.util.Scanner;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n){
        if(n<=0)
            return false;
        while (n>2){
            n=n/2;
            if(n%2!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(isPowerOfTwo(n))
            System.out.println(n+" is a power of 2");
        else
            System.out.println(n+" is not a power of 2");
    }
}
