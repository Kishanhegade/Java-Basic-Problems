package com;

import java.util.Scanner;

public class P1 {
    public static int convertAscii(char ch){
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character");
        int ascii = convertAscii(sc.next().charAt(0));
        System.out.println(ascii);

    }
}
