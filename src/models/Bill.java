package models;
import java.util.List;
import java.util.Date;

public class Bill {
    private int id;
    private Ticket ticket;
    private Date exitTime;
    private double amount;
    private List<Payment> payments;
    private BillStatus billStatus;


}
