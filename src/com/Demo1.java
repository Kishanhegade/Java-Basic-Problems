package com;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Please enter a character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println("lower case");
        else if(ch>='A' && ch<='Z')
            System.out.println("upper case");
        else if(ch>='0' && ch<='9')
            System.out.println("number");
        else
            System.out.println("special character");

    }

}
