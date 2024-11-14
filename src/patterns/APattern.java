package patterns;

import java.util.Scanner;

public class APattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        int x = n,y=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=y;j++){
                if(j==x||j==y||i==n/2+1&&j>=n/2+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            x--;
            y++;
            System.out.println();
        }
    }
}
