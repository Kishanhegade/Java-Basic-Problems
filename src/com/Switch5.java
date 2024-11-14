package com;

import java.util.Scanner;

public class Switch5 {
    static Scanner sc = new Scanner(System.in);
    public static int returnDays(String month){
        switch (month){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":{
                System.out.println("Please enter the year");

                int year = sc.nextInt();
                if(year % 4==0 && year%100!=0 || year%400==0){
                    return 29;
                }
                else
                    return 28;
            }
            default:return 0;
        }
    }

    public static void main(String[] args) {
        int res = returnDays(sc.next());
        System.out.println(res);
    }
}
