package Loops;

import java.util.Scanner;

public class PrintPrime {
    static void printPrimeInRange(int n,int nth){
        int value = 0;
        int num = 0;
        for(int i = 1;i<=n;i++){
            int count = 0;
            for(int j=2;j<=i/2;j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.print(i + " ");
                num++;
                if(num==nth) {
                    value = i;
                }
            }
        }
        System.out.println();
        System.out.println(value);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printPrimeInRange(sc.nextInt(),sc.nextInt());
        sc.close();
    }
}
