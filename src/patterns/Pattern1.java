package patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n/2,st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            int x = 1;
            for(int j=1;j<=st;j++){
                System.out.print(x+" ");
                x++;
                if(j<st)
                    System.out.print("* ");
            }
            if(i<=n/2){
                sp--;
                st+=1;
            }
            else{
                sp++;
                st-=1;
            }
            System.out.println();
        }
    }
}
