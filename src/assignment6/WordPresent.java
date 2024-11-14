package assignment6;

import java.util.Scanner;

public class WordPresent {
    public static boolean isPresent(String s1,String s2){

        char []c1=s1.toCharArray();//java is a programming language
        char [] c2 = s2.toCharArray();//is
        for (int i = 0; i < c1.length; i++) {

            if (i==0 && c1[i]!=' '||c1[i]!=' ' && c1[i-1]==' '){
                int j=0,k=i;
                int lcount=0;
                while(k<c1.length && c1[k]!=' ')
                {
                    lcount++;
                    k++;
                }

                while(i< c1.length && j< c2.length){
                    if(c1[i]!=c2[j])
                        break;
                    i++;
                    j++;
                }
                if (j== c2.length && j==lcount)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string");
        String s2 = sc.nextLine();
        if(isPresent(s1,s2))
            System.out.println("Word present");
        else
            System.out.println("not present");
    }
}
