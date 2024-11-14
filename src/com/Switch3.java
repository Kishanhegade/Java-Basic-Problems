package com;

import java.util.Scanner;

public class Switch3 {
    public static String timeTable(String day){
        switch(day) {
            case "Monday":
                return "SQL";

            case "Tuesday":
                return "Java";

            case "Wednesday":
                return "Web";

            case "Thursday":
                return "Aptitude";

            case "Friday":
                return "Pre-Programming";

            case "Saturday":
                return "Mock";
            default:
                return "Enter valid day";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        String res = timeTable(day);
        System.out.println(res);
    }
}
