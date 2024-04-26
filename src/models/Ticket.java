package models;

import java.util.Date;

public class Ticket extends BaseModel{
    private String number;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot assignedSpot;
    private Gate generatedAtGate;
    private Operator generatedByOperator;

}
