package com;

public class Mom {
    void gives(){
        Chocolate c = new Chocolate();
        Kid k = new Kid();
        k.take(c);
        System.out.println("com.Mom gives chocolate to the kid "+c);
    }

    public static void main(String[] args) {
        Mom m = new Mom();
        m.gives();
    }
}
