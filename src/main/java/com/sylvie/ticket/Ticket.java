package com.sylvie.ticket;

public class Ticket {
    static final int TAIPEI_STATION = 100;
    static final int TAICHUNG_STATION = 200;
    static final int KAOHSIUNG_STATION = 300;

    Station start;
    Station destination;
    Station price;
    public Ticket(Station start, Station destination){
        this.start=start;
        this.destination=destination;
    }
    public void print(){

    }
}
