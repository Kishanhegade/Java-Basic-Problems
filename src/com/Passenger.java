package com;

import com.Conductor;

class Passenger {
    void takeTicket(){
        Conductor c = new Conductor();
        c.issueTicket();
        System.out.println("com.Ticket has been taken by the passenger");
    }
}
