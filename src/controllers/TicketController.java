package controllers;

import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import exceptions.GateNotFoundExceptions;
import models.Ticket;
import services.TicketService;

public class TicketController {
    private TicketService ticketService;
    TicketController(TicketService ticketService) {
        this.ticketService=ticketService;
    }
    public IssueTicketResponseDTO createTicket(IssueTicketRequestDTO issueTicketRequestDTO) throws GateNotFoundExceptions {
        return  ticketService.createTicket(issueTicketRequestDTO);
    }
}
