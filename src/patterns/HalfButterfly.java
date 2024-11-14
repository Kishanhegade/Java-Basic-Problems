package patterns;

import java.util.Scanner;

public class HalfButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter n value");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n*2-1;j++){
                if(j<=i||i+j>=n*2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for(int i =n-1;i>=1;i--){
            for(int j=1;j<=n*2-1;j++){
                if(j<=i||i+j>=n*2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
