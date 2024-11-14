package com;

import java.util.Scanner;

public class Alphabets {
    String returnType(char ch){
        switch(ch){
            case 'a': case 'e': case 'i': case'o': case 'u':return "vowels";

            default: return "Consonant";
        }
    }

    public static void main(String[] args) {
        Alphabets a = new Alphabets();
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z') {
            String res = a.returnType(ch);
            System.out.println(res);
        }
        else {
            System.out.println("Its not an alphabet");
        }
    }
}
