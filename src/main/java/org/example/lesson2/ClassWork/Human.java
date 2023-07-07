package org.example.lesson2.ClassWork;

public class Human {
    private Transport currTransport;

    public void drive(Transport transport) {
        currTransport = transport;
        transport.run();
    }

    public void stop() {
        if (currTransport != null) {
            currTransport.stop();
            currTransport = null;
        } else
            System.out.println("Don't ride!");
    }
}
