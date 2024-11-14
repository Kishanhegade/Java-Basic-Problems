package com;

public class Owner {
    void feed(){
        Bread b = new Bread();
        Dog d = new Dog();
        d.eat(b);
        System.out.println("com.Owner feeds the bread " + b);
    }

}
