package com;

import com.Passenger;

public class TicketTest {
    public static void main(String[] args) {
        System.out.println("main start");
        Passenger p = new Passenger();
        p.takeTicket();
        System.out.println("main end");
    }
}
