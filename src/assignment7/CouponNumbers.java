package assignment7;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupon numbers: ");
        int N = scanner.nextInt();


        int randomNumbersNeeded = getDistinctCouponCount(N);

        System.out.println("Total random numbers needed to collect all distinct coupons: " + randomNumbersNeeded);


        scanner.close();
    }

    public static int generateRandomNumber(int N) {
        Random random = new Random();
        return random.nextInt(N);
    }

    public static int getDistinctCouponCount(int N) {

        HashSet<Integer> coupons = new HashSet<>();
        int randomNumbersCount = 0;

        while (coupons.size() < N) {
            int newCoupon = generateRandomNumber(N);
            randomNumbersCount++;
            // Add the coupon to the set if it's new (distinct)
            coupons.add(newCoupon);
        }
        System.out.println(coupons);
        return randomNumbersCount;
    }
}
