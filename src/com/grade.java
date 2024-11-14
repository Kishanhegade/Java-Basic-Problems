package com;

import java.util.Scanner;

public class grade {
    public static char checkGrade(int marks){
        if(marks > 90 && marks<=100)
            return 'S';
        else if (marks >80 && marks <=90) {
            return 'A';
        } else if (marks > 65 && marks <=80) {
            return 'B';
        }
        else if (marks>50 && marks <=65)
            return 'C';
        else if (marks >35 && marks <=50)
            return 'D';
        else if(marks >= 0 && marks <=35)
            return 'F';
        else{

            return ' ';
        }
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int marks = scan.nextInt();
        char result = checkGrade(marks);
        if(result !=' ')
            System.out.println("The com.grade of the student is " + result);
        else
            System.out.println("Invalid number");
    }
}
