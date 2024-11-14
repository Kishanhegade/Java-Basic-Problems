package assignment2;

import java.util.Scanner;

public class GoodOrBad {

    static String checkGoodBad(int n){
        int ecount =0;
        int ocount =0;

        do {
            int d = n % 10;
            if (d % 2 == 0)
                ecount++;
            else
                ocount++;
            n = n / 10;
        }while(n!=0);
        if(ecount==ocount)
            return "Good";
        else
            return "Bad";
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        String goodOrBad  = checkGoodBad(n);
        System.out.println(goodOrBad);
    }
    }


