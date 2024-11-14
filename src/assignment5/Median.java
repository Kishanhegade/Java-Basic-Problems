package assignment5;

import java.util.Arrays;

public class Median {
    public static double medianOfTwoArray(int[] a,int[] b)
    {
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i] = b[i];
        }
        Arrays.sort(c);
        int n = c.length;
        if(n%2==0)
            return (c[n/2]+c[n/2-1])/2;
        else
            return (c[n/2]);
    }

    public static void main(String[] args) {
        int[] a1 = {-5,3,6,12,15};
        int[] a2 = {-12,-10,-6,-3,4,10};
        System.out.println(medianOfTwoArray(a1,a2));
    }
}
