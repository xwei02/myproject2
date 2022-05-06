package com.sylvie.ticket;

public class Ticket {
    static final int TAIPEI_STATION = 100;
    static final int TAICHUNG_STATION = 200;
    static final int KAOHSIUNG_STATION = 400;

    Station start;
    Station destination;
    int price;

    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id-destination.id);
        System.out.println("diff:"+diff);
        switch (diff){
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }
        /*if (start == Station.TAIPEI_STATION) {
            if (destination == Station.TAICHUNG_STATION) {
                price = 600;
            } else {
                price = 1500;
            }
        } else if (start == Station.TAICHUNG_STATION) {
            if (destination == Station.TAIPEI_STATION) {
                price = 600;
            } else {
                price = 900;
            }
        } else if (start == Station.KAOHSIUNG_STATION) {
            if (destination == Station.TAICHUNG_STATION) {
                price = 900;
            } else {
                price = 1500;
            }

        }*/

    }
    public void print () {
        System.out.println(start.name + "\t" + destination.name +"\t"+ price);

    }
}

