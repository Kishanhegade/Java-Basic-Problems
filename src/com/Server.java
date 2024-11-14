package com;

public class Server {
    void serve(){
        Beer b = new Beer();
        System.out.println(" Serve the com.Beer");
    }

    public static void main(String[] args) {
        Server s = new Server();
        s.serve();
    }
}
