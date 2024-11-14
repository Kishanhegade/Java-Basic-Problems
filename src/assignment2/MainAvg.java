package assignment2;

import java.util.Scanner;

public class MainAvg {
    static int calculateAvg(int n){
        double sum = 0;
        int count = 0;
        do{
            int d = n%10;
            sum += d;
            n=n/10;
            count++;
        }while(n!=0);
        return (int)sum/count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int avg = calculateAvg(n);
        System.out.println("The avg of digits of "+n+" is "+avg);

    }
}
