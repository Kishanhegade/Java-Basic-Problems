package com;

public class Shopkeeper {
    Product sell(){
        Product p = new Product();
        System.out.println("Shop Keeper sells the product");
        return p;
    }

    public static void main(String[] args) {
        Shopkeeper shop = new Shopkeeper();
        shop.sell();
    }
}
