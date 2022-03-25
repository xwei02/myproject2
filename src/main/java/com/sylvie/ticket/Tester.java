package com.sylvie.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(
                Ticket.TAIPEI_STATION,
                Ticket.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(Scanner.next());
        System.out.println("Your start station? (1: Taipei (2: Taichung (3: Kaohsiung");
        switch (choice){
            case 1:

        }

    }
}
