package services;

import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import dtos.ResponseStatus;
import exceptions.GateNotFoundExceptions;
import models.Gate;
import models.Ticket;
import models.VehicleType;
import repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }
    public IssueTicketResponseDTO createTicket(IssueTicketRequestDTO issueTicketRequestDTO) throws GateNotFoundExceptions {
        Long gateId = issueTicketRequestDTO.getGateId();
        VehicleType vehicleType = issueTicketRequestDTO.getVehicleType();
        String vehicleNumber = issueTicketRequestDTO.getVehicleNumber();
        String ownerName = issueTicketRequestDTO.getOwnerName();


        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if(optionalGate.isEmpty()){
            throw new GateNotFoundExceptions("Invalid Gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAtGate(gate);
        ticket.setGeneratedByOperator(gate.getOperator());

        IssueTicketResponseDTO  issueTicketResponseDTO = new IssueTicketResponseDTO();
        issueTicketResponseDTO.setTicket(ticket);
        issueTicketResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);

        return issueTicketResponseDTO;

    }
}
