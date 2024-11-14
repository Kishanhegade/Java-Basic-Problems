package Loops;

import java.util.Scanner;

public class Factorial {

    public static int factors(int n){
        int count = 0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = Factorial.factors(n);
        System.out.println(count);

    }
}
