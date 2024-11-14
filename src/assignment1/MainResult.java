package assignment1;

import java.util.Scanner;

public class MainResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        String res = checkResult(m1,m2,m3,m4);
        System.out.println(res);

    }

    static String checkResult(int m1,int m2,int m3,int m4){
        if(m1<35||m2<35||m3<35||m4<35)
            return "Fail";
        int percentage = (int) (((m1+m2+m3+m4)/400.0)*100);
        if(percentage > 85)
            return "Distinction";
        else if(percentage >65)
            return "First Class";
        else if(percentage > 50)
            return "Second Class";
        else
            return "Pass";



    }


}
