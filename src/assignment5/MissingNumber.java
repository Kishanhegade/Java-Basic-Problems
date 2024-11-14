package assignment5;

import java.util.Arrays;

public class MissingNumber {

    public static void printMissingNumber(int[] a){
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if(i<a.length-1 && a[i+1]!=a[i]+1)
                System.out.println(a[i]+1);
        }
    }

    public static void main(String[] args) {
        printMissingNumber(new int[]{6,1,2,8,3,4,7,10,5,9,12});
    }
}
