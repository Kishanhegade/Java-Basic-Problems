package com;

public class Calculator {
    void findCircleArea(double r){
        int area = (int) (3.142 * r * r);
        System.out.println("Radius is " + r);
        System.out.println("Area of the circle is " + area);
    }
    void findTriangleArea(double base, double height ){
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is " + area);
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.findCircleArea(55.5);
        c.findTriangleArea(33,50);
    }
}
