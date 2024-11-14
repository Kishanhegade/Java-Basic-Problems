package patterns;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            int sp=2*(n-i)-1;
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){

                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
