package patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=n;i>=1;i--)
//        {
//            for(int j=1;j<n*2;j++)
//            {
//                if(j<=i||n*2-j<=i)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }

        int y = n*2-1;
        for(int i=n;i>=1;i--)
        {
            int x =1;
            for(int j=1;j<n*2;j++)
            {
                if(j<=i||n*2-j<=i) {
                    System.out.print(x+" ");

                }
                else
                    System.out.print("  ");
                if(j<=y/2)
                    x++;
                else
                    x--;
            }
            System.out.println();
        }
    }
}
