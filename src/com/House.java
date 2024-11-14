package com;

public class House {
    Person p = new Person();

    public static void main(String[] args) {
        House h = new House();
        h.p.name = "Sam";
        h.p.f.onFan();
        System.out.println(h.p.name);
    }
}
