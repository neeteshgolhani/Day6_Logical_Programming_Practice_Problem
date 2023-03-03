package com.bridgelabz;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class CouponNumber {
    public static void main(String[] args) {
        int[] couponNumbers = {1, 2, 3, 4, 5}; // Replace with your distinct coupon numbers
        int numCoupons = couponNumbers.length;
        int numRandoms = generateDistinctCoupons(couponNumbers);
        System.out.println("To generate all " + numCoupons + " distinct coupon numbers, " +
                "you need to generate " + numRandoms + " random numbers.");
    }

    public static int generateDistinctCoupons(int[] couponNumbers) {
        Set<Integer> distinctCoupons = new HashSet<>();
        Random random = new Random();
        int numRandoms = 0;
        while (distinctCoupons.size() < couponNumbers.length) {
            int randomNum = random.nextInt(couponNumbers.length);
            numRandoms++;
            distinctCoupons.add(couponNumbers[randomNum]);
        }
        return numRandoms;
    }
}