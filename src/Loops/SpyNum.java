package Loops;

import java.util.Scanner;

public class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfDigits s = new SumOfDigits();
        ProductOfNumbers p = new ProductOfNumbers();
        int res1 = s.sumOfDigits(sc.nextInt());
        int res2 = p.productOfNumbers(sc.nextInt());
        sc.close();
        if(res1==res2){
            System.out.println("Its a spy number");
        }
        else
            System.out.println("not a spy number");
    }
}
