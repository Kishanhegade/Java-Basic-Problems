package assignment6;

import java.util.Scanner;

public class IndexAfterSub {
    public static int printCharAfterSub(String s1,String s2){
        char [] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            int j=0;
            while(j<c2.length && i<c1.length){
                if(c1[i]!=c2[j]){
                    break;
                }
                j++;
                i++;
            }
            if (j== c2.length)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string");
        String s2 = sc.nextLine();
        int pos = printCharAfterSub(s1,s2);
        if(pos==-1)
            System.out.println(s2+ " is not a substring of "+s1);
        else {
            int sum=0;
            for (int i = pos; i < s1.length(); i++) {
//                System.out.print(s1.charAt(i));
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}
