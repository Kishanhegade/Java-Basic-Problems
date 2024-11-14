package com;

class Conductor {
    String name = "Babu";
    Ticket issueTicket(){
        Ticket t1 = new Ticket();
        System.out.println(this.name + " has issued the com.Ticket");
        return t1;
    }

    public static void main(String[] args) {
        Conductor c = new Conductor();
        Ticket details = c.issueTicket();
        System.out.println("The ticket fare is "+ details.fare + " rupees on "+ details.date );
    }
}
