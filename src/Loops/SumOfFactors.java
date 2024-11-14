package Loops;

import java.util.Scanner;

public class SumOfFactors {
    static int sumofFactors(int num){
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i == 0){
                sum+=i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int res = sumofFactors(scanner.nextInt());
        System.out.println("The sum of factors is: " + res);
    }
}
