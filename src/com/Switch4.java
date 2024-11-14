package com;

import java.util.Scanner;

public class Switch4 {
    public static String returnMonth(int days){
        switch(days){
            case 28:
            case 29:
                return "February";
            case 30:
                return "April,June,September,November";
            case 31:
                return "January,March,May,July,August,October,December";
            default:
                return "Enter valid days";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = returnMonth(sc.nextInt()) ;
        System.out.println(res);
    }
}
