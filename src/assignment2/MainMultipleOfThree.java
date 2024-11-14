package assignment2;

import java.util.Scanner;

public class MainMultipleOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = countMultiple(n);
        System.out.println("Number of multiples of 3 is :" + count);
    }
    static int countMultiple(int n){
        int count =0;
        do {
            int d = n % 10;
            if (d % 3 == 0)
                count++;
            n = n / 10;
        } while(n!=0) ;

        return count;
        }
}

