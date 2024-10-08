package com.xworkz.enumCreation.constants.Runner;

import com.xworkz.enumCreation.constants.ProductType;
import com.xworkz.enumCreation.constants.SeatType;
import com.xworkz.enumCreation.constants.TicketType;
import com.xworkz.enumCreation.constants.DTO.CustomerDTO;
import com.xworkz.enumCreation.constants.DTO.TicketBookDTO;

public class EnumRunner {
	
    public static void main(String[] args) {
        
        CustomerDTO customer = new CustomerDTO("Sumedh", "sumedh4444.com", ProductType.KITCHEN);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Product Type: " + customer.getProductType());

        
        TicketBookDTO ticket = new TicketBookDTO("Sanam teri kasam", "PVRF", TicketType.ONLINE, SeatType.RECLINER);
        System.out.println("\nMovie Name: " + ticket.getMovieName());
        System.out.println("Theater Name: " + ticket.getTheaterName());
        System.out.println("Ticket Type: " + ticket.getTicketType());
        System.out.println("Seat Type: " + ticket.getSeatType());
        System.out.println("Ticket Cost: $" + ticket.getTicketType().getCost());
        System.out.println("Seat Number: " + ticket.getSeatType().getSeatNo());
    }
}