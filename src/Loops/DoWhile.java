package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        int count = 0;
        do{
            n=n/10;
            count++;
        }while(n>0);
        System.out.println(count);
    }
}
