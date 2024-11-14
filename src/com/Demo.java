package com;

import java.util.Scanner;
class Demo{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rem = 0;
        int count = 0;
        while(n>0){
//            rem = n%10;
            n = n/10;
            count++;
        }
//        System.out.println("First digit is "+ rem);
        System.out.println(count);
        sc.close();
    }
}
