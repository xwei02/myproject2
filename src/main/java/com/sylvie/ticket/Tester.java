package com.sylvie.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(
                Station.TAIPEI_STATION,
                Station.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? (1: Taipei (2: Taichung (3: Kaohsiung");
        int choice = Integer.parseInt(scanner.next());
        Station start = null;
        switch (choice){
            case 1:
                start = Station.TAIPEI_STATION;
                break;
            case 2:
                start = Station.TAICHUNG_STATION;
                break;
            case 3:
                start = Station.KAOHSIUNG_STATION;
                break;
        }
        Station destination = null;
        switch (choice){
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Which kind of ticket?");

    }
}
