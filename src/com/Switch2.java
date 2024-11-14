package com;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n%2){
            case 0:
                System.out.println("even");
                break;
            default:
                System.out.println("odd");
        }
    }
}
