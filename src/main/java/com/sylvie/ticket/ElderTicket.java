package com.sylvie.ticket;

public class ElderTicket extends Ticket{
    float off = 0.5f;
    public ElderTicket(Station start, Station destination){
        super(start, destination);
        price = price - (int)(price*off);
    }
}
