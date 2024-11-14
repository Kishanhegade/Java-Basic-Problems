package assignment3;

import java.util.Scanner;

public class MainLuckyDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your date of birth in dd mm yyyy format:");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        int luckyNumber = luckyDigit(dd,mm,yyyy);
        System.out.println("Your lucky number is " + luckyNumber);
    }
    static int luckyDigit(int dd,int mm,int yyyy){
        int sum = sumOfDigits(dd)+sumOfDigits(mm)+sumOfDigits(yyyy);
        while(sum>9) {
            sum = sumOfDigits(sum);
        }
        return sum;
    }
    static int sumOfDigits(int x){
        int sum = 0;
        do{
            int d = x%10;
            sum+=d;
            x=x/10;
        }while(x!=0);
        return sum;
    }
}
