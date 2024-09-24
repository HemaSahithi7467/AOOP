package com.system;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerSupport {
    private Queue<String> tickets;

    public CustomerSupport() {
        tickets = new LinkedList<>();
    }

    // Add new ticket
    public void addTicket(String ticket) {
        tickets.add(ticket);
    }

    // Process the next ticket
    public void processTicket() {
        if (!tickets.isEmpty()) {
            System.out.println("Processing ticket: " + tickets.poll());
        } else {
            System.out.println("No tickets to process");
        }
    }

    // Display all pending tickets
    public void displayTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No pending tickets");
        } else {
            System.out.println("Pending tickets: " + tickets);
        }
    }

    public static void main(String[] args) {
        CustomerSupport cs = new CustomerSupport();
        cs.addTicket("Ticket 1");
        cs.addTicket("Ticket 2");
        cs.displayTickets();
        cs.processTicket();
        cs.displayTickets();
    }
}

