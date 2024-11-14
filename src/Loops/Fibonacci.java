package Loops;

import java.util.Scanner;

public class Fibonacci {
    static void printFibonacci(int n,int nth){
        int a = 0;
        int b = 1;
        int pos = 0;
        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            if(nth ==i){
                pos = a;
            }
            int temp = a + b;
            a = b;
            b =  temp;

        }
        System.out.println();
        System.out.println(pos);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number range and nth position: ");

        printFibonacci(sc.nextInt(), sc.nextInt());
        sc.close();

    }
}
