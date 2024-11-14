package Loops;

import java.util.Scanner;

public class For {
    static int factorial(int num){
        int product = 1;
        for(int i=1;i<=num;i++){

            product*=i;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(factorial(num));
    }
}
