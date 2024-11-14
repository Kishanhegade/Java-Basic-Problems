package com;

public class Switch1 {
    public static void main(String[] args) {
        int a = 5;
        switch (a)
        {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            case 30:
                System.out.println("thirty");
            case 5:
                System.out.println("five");
                break;
            case 21:
                System.out.println("twenty one");
            default:
                System.out.println("Invalid number");
        }
    }
}
