package assignment5;

public class PeakElement {


    public static int printPeak(int [] a){
        for (int i = 0; i < a.length; i++) {
            if (i==0 && a[i]>a[i+1] || i==a.length-1 && a[i]>a[i-1])
                return a[i];
            else if(i>0 && i< a.length-1 && a[i]>a[i-1] && a[i]>a[i+1])
                return a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        printPeak(new int[]{5,2,4,3,5,7,8,6,9});
    }
}
