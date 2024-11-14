package com;

public class DeliveryPerson {
    void deliver(){
        Courier cr = new Courier();
        Customer c = new Customer();
        c.take(cr);
        System.out.println("Delivery person delivers the courier " + cr);
    }

    public static void main(String[] args) {
        DeliveryPerson dp = new DeliveryPerson();
        dp.deliver();
    }
}
